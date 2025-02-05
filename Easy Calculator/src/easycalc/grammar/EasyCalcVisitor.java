// Generated from /Users/rahul/IdeaProjects/Easy Calculator/src/easycalc/grammar/EasyCalc.g4 by ANTLR 4.13.2
package easycalc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EasyCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EasyCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EasyCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(EasyCalcParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(EasyCalcParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EasyCalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EasyCalcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(EasyCalcParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#outputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStmt(EasyCalcParser.OutputStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(EasyCalcParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(EasyCalcParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(EasyCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(EasyCalcParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EasyCalcParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Math}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(EasyCalcParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(EasyCalcParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link EasyCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(EasyCalcParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(EasyCalcParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(EasyCalcParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(EasyCalcParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#typecast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecast(EasyCalcParser.TypecastContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyCalcParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(EasyCalcParser.ConditionalContext ctx);
}