// Rahul Shrestha
//

package easycalc;

import easycalc.grammar.EasyCalcBaseListener;
import easycalc.grammar.EasyCalcParser;

import java.util.*;

public class AnalysisListener extends EasyCalcBaseListener {

    private SortedMap<String, String> symbolTable = new TreeMap<>();

    private String errorMessage = "";

    private Stack<String> stack = new Stack<>();

    // error handler
    private List<String> errors = new ArrayList<>();

    private List<Integer> ifElseErrorPosition = new ArrayList<>();

    // output grabber
    public String getSymbolTableString() {
        String output = "\n";

        for (String symbol: symbolTable.keySet()) {
            output = output + symbol + " -> " + (symbolTable.get(symbol)).toUpperCase() + "\n";
        }

        return output;
    }

    // error message print
    public String getErrorMessageString() {
        String output = "";
        ArrayList<Integer> lines = new ArrayList<>();

        for (String error: errors) {
            String[] errorSplit = error.split(" ");
            int line = Integer.parseInt("" + errorSplit[errorSplit.length - 1].charAt(0));
            if (!lines.contains(line)) {
                lines.add(line);
                output = output + error + "\n";
            }
        }

        return output;
    }

    @Override public void exitDeclar(EasyCalcParser.DeclarContext ctx) {

        String id = ctx.ID().getText();
        String type = ctx.type.getText().toUpperCase();

        if (!symbolTable.containsKey(id)) symbolTable.put(id, type);
        else {
            String linePosition = ctx.ID().getSymbol().getLine() + "";
            String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

            String error = "redefinition of " + id + " at " + linePosition + ":" + columnPosition;
            errors.add(error);
        };
    }

    @Override public void exitAssignStmt(EasyCalcParser.AssignStmtContext ctx) {
        String id = ctx.ID().getText();

        if (stack.size() <= 1) {
            String expr = stack.pop();

            if (!symbolTable.containsKey(id)) {
                String linePosition = ctx.ID().getSymbol().getLine() + "";
                String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

                String error = id + " undefined at " + linePosition + ":" + columnPosition;
                errors.add(error);
            } else {
                if (!symbolTable.get(id).equals(expr) || expr.equals("ERROR")) {
                    String linePosition = ctx.ID().getSymbol().getLine() + "";
                    String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

                    String error = "type clash at " + linePosition + ":" + columnPosition;
                    errors.add(error);
                }
            }
        } else {
            String e2 = stack.pop();
            String e1 = stack.pop();

            if (!symbolTable.containsKey(id)) {
                String linePosition = ctx.ID().getSymbol().getLine() + "";
                String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

                String error = id + " undefined at " + linePosition + ":" + columnPosition;
                errors.add(error);
            } else {
                if (!symbolTable.get(id).equals(e1)) {
                    String linePosition = ifElseErrorPosition.get(0).toString();
                    String columnPosition = ifElseErrorPosition.get(1).toString();

                    String error = "type clash at " + linePosition + ":" + columnPosition;
                    errors.add(error);
                } else if (!symbolTable.get(id).equals(e2)) {
                    String linePosition = ifElseErrorPosition.get(2).toString();
                    String columnPosition = ifElseErrorPosition.get(3).toString();

                    String error = "type clash at " + linePosition + ":" + columnPosition;
                    errors.add(error);
                }
            }
        }
    }

    @Override public void exitReadStmt(EasyCalcParser.ReadStmtContext ctx) {
        String id = ctx.ID().getText();

        if (symbolTable.containsKey(id)) {
            String type = symbolTable.get(id);

            if (type.equals("BOOL")) {
                String linePosition = ctx.ID().getSymbol().getLine() + "";
                String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

                String error = "read undefined for BOOL at " + linePosition + ":" + columnPosition;
                errors.add(error);
            } else {
                stack.push(type);
            }
        } else {
            String linePosition = ctx.ID().getSymbol().getLine() + "";
            String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

            String error = id + " undefined at " + linePosition + ":" + columnPosition;
            errors.add(error);
        }
    }

    @Override public void exitWriteStmt(EasyCalcParser.WriteStmtContext ctx) { }

    @Override public void exitLitExpr(EasyCalcParser.LitExprContext ctx) {
        String literal = ctx.LIT().getText();

        if (literal.equals("true") | literal.equals("false")) {
            stack.push("BOOL");
        } else if (literal.contains(".")) {
            stack.push("REAL");
        } else {
            stack.push("INT");
        }
    }

    @Override public void exitIdExpr(EasyCalcParser.IdExprContext ctx) {
        String id = ctx.ID().getText();

        if (symbolTable.containsKey(id)) {
            stack.push(symbolTable.get(id));
        } else {
            String linePosition = ctx.ID().getSymbol().getLine() + "";
            String columnPosition = (ctx.ID().getSymbol().getCharPositionInLine() + 1) + "";

            String error = id + " undefined at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
         }
    }

    @Override public void exitParenExpr(EasyCalcParser.ParenExprContext ctx) {
    }

    @Override public void exitToExpr(EasyCalcParser.ToExprContext ctx) {
        String expr = stack.pop();
        String op = ctx.op.getText();

        if (expr.equals("BOOL")) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 8) + "";

            String error = op + " undefined for " + expr + " at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
        } else {
            if ((op.equals("to_real") && expr.equals("REAL")) || (op.equals("to_int") && expr.equals("INT"))) {
                String linePosition = ctx.op.getLine() + "";
                int num = 0;
                if (op.equals("to_real")) num = 9; else num = 8;
                String columnPosition = (ctx.op.getCharPositionInLine() + num) + "";

                String error = op + " undefined for " + expr + " at " + linePosition + ":" + columnPosition;
                errors.add(error);
            }
        }
    }

    @Override public void exitMulDivExpr(EasyCalcParser.MulDivExprContext ctx) {
        String expr2 = stack.pop();
        String expr1 = stack.pop();
        String op = ctx.op.getText();

        if (expr1.equals(expr2)) {
            stack.push(expr1);
        } else if (expr1.equals("BOOL")) {
            System.out.println(expr1);
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() - 1) + "";

            String error = op + " undefined for " + expr1 + " at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
        } else if (expr2.equals("BOOL")) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 3) + "";

            String error = op + " undefined for " + expr2 + " at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
        } else if (expr1.equals("ERROR") && !expr2.equals("ERROR")) {
            stack.push(expr2);
        } else if (expr2.equals("ERROR") && !expr1.equals("ERROR")) {
            stack.push(expr1);
        } else if (!expr1.equals(expr2)) {
            String linePosition = ctx.expr(0).getStart().getLine() + "";
            String columnPosition = (ctx.expr(0).getStart().getCharPositionInLine() + 1) + "";

            String error = "type clash at " + linePosition + ":" + columnPosition;
            stack.add("ERROR");
            errors.add(error);
        }
    }

    @Override public void exitAddSubExpr(EasyCalcParser.AddSubExprContext ctx) {
        // Get the necessary information from ctx and stack
        String expr1 = stack.pop();
        String expr2 = stack.pop();
        String op = ctx.op.getText();

        // Manage all possible errors
        if (expr1.equals(expr2)) {
            stack.push(expr1);
        } else if (expr1.equals("BOOL")) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 1) + "";

            String error = op + " undefined for " + expr1 + " at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
        } else if (expr2.equals("BOOL")) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 1) + "";

            String error = op + " undefined for " + expr1 + " at " + linePosition + ":" + columnPosition;
            stack.push("ERROR");
            errors.add(error);
        } else if (expr1.equals("ERROR") && !expr2.equals("ERROR")) {
            stack.push(expr2);
        } else if (expr2.equals("ERROR") && !expr1.equals("ERROR")) {
            stack.push(expr1);
        } else if (!expr1.equals(expr2)) {
            String linePosition = ctx.expr(0).getStart().getLine() + "";
            String columnPosition = (ctx.expr(0).getStart().getCharPositionInLine() + 1) + "";

            String error = "type clash at " + linePosition + ":" + columnPosition;
            stack.add("ERROR");
            errors.add(error);
        }
    }

    @Override public void exitLessGrtrExpr(EasyCalcParser.LessGrtrExprContext ctx) {
        String expr1 = stack.pop();
        String expr2 = stack.pop();
        String op = ctx.op.getText();

        if (!expr1.equals(expr2)) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 1) + "";

            String error = op + " undefined for " + expr1 + " and " + expr2 + " at " + linePosition + ":" + columnPosition;
            errors.add(error);
        } else {
            stack.push("BOOL");
        }
    }

    public void exitEqualExpr(EasyCalcParser.EqualExprContext ctx) {
        String expr1 = stack.pop();
        String expr2 = stack.pop();
        String op = ctx.op.getText();

        if (!expr1.equals(expr2)) {
            String linePosition = ctx.op.getLine() + "";
            String columnPosition = (ctx.op.getCharPositionInLine() + 1) + "";

            String error = op + " undefined for " + expr1 + " and " + expr2 + " at " + linePosition + ":" + columnPosition;
            errors.add(error);
        } else {
            stack.push("BOOL");
        }
    }

    @Override public void exitAndExpr(EasyCalcParser.AndExprContext ctx) {
        String expr1 = stack.pop();
        String expr2 = stack.pop();
        String op = ctx.op.getText();

        if (expr1.equals("BOOL") && expr2.equals("BOOL")) {
            stack.push("BOOL");
        } else {
            if (!expr1.equals("BOOL")) {
                String linePosition = ctx.op.getLine() + "";
                String columnPosition = (ctx.getStart().getCharPositionInLine() + 1) + "";

                String error = op + " undefined for " + expr1 + " at " + linePosition + ":" + columnPosition;
                stack.push("ERROR");
                errors.add(error);
            } else {
                String linePosition = ctx.op.getLine() + "";
                String columnPosition = (ctx.op.getCharPositionInLine() + 4) + "";

                String error = op + " undefined for " + expr2 + " at " + linePosition + ":" + columnPosition;
                errors.add(error);
                stack.push("ERROR");
            }
        }
    }

    @Override public void exitOrExpr(EasyCalcParser.OrExprContext ctx) {

        String expr2 = stack.pop();
        String expr1 = stack.pop();
        String op = ctx.op.getText();

        if (expr1.equals("BOOL") && expr2.equals("BOOL")) {
            stack.push("BOOL");
        } else {
            if (!expr1.equals("BOOL")) {
                String linePosition = ctx.op.getLine() + "";
                String columnPosition = (ctx.getStart().getCharPositionInLine() + 1) + "";

                String error = op + " undefined for " + expr1 + " at " + linePosition + ":" + columnPosition;
                errors.add(error);
                stack.push("ERROR");
            } else {
                String linePosition = ctx.op.getLine() + "";
                String columnPosition = (ctx.op.getCharPositionInLine() + 4) + "";

                String error = op + " undefined for " + expr2 + " at " + linePosition + ":" + columnPosition;
                errors.add(error);
                stack.push("ERROR");
            }
        }
    }

    @Override public void exitIfExpr(EasyCalcParser.IfExprContext ctx) {
        String e2 = stack.pop();
        String e1 = stack.pop();
        String expr = stack.pop();


        if (!expr.equals("BOOL")) {
            String linePosition = ctx.IF().getSymbol().getLine() + "";
            String columnPosition = (ctx.getStart().getCharPositionInLine() + 4) + "";

            String error = "if undefined for " + expr + " at " + linePosition + ":" + columnPosition;
            stack.add("ERROR");
            errors.add(error);
        } else {
            ifElseErrorPosition.clear();
            stack.push(e1);
            ifElseErrorPosition.add(ctx.THEN().getSymbol().getLine()); ifElseErrorPosition.add(ctx.THEN().getSymbol().getCharPositionInLine() + 6);
            stack.push(e2);
            ifElseErrorPosition.add(ctx.ELSE().getSymbol().getLine()); ifElseErrorPosition.add(ctx.ELSE().getSymbol().getCharPositionInLine() + 6);
        }
    }

}
