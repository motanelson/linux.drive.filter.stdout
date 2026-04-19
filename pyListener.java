// Generated from py.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pyParser}.
 */
public interface pyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(pyParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(pyParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(pyParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(pyParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(pyParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(pyParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(pyParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(pyParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pyParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pyParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(pyParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(pyParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(pyParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(pyParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(pyParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(pyParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(pyParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(pyParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pyParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pyParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(pyParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(pyParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(pyParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(pyParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(pyParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(pyParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(pyParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(pyParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(pyParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(pyParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(pyParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(pyParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(pyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(pyParser.LiteralContext ctx);
}