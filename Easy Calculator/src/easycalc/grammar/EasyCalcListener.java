// Generated from /Users/rahul/IdeaProjects/Easy Calculator/src/easycalc/grammar/EasyCalc.g4 by ANTLR 4.13.2
package easycalc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyCalcParser}.
 */
public interface EasyCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EasyCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EasyCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EasyCalcParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EasyCalcParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(EasyCalcParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(EasyCalcParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EasyCalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EasyCalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EasyCalcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EasyCalcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(EasyCalcParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(EasyCalcParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmt(EasyCalcParser.OutputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmt(EasyCalcParser.OutputStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(EasyCalcParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(EasyCalcParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(EasyCalcParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(EasyCalcParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(EasyCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(EasyCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(EasyCalcParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(EasyCalcParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EasyCalcParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EasyCalcParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Math}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMath(EasyCalcParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Math}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMath(EasyCalcParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic(EasyCalcParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic(EasyCalcParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(EasyCalcParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(EasyCalcParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(EasyCalcParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(EasyCalcParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(EasyCalcParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(EasyCalcParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(EasyCalcParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(EasyCalcParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#typecast}.
	 * @param ctx the parse tree
	 */
	void enterTypecast(EasyCalcParser.TypecastContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#typecast}.
	 * @param ctx the parse tree
	 */
	void exitTypecast(EasyCalcParser.TypecastContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(EasyCalcParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(EasyCalcParser.ConditionalContext ctx);
}