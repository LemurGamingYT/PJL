package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PJLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PJLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PJLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PJLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PJLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#var_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assignment(PJLParser.Var_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#func_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_assignment(PJLParser.Func_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PJLParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PJLParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PJLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PJLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PJLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PJLParser.AtomContext ctx);
}