// Generated from /home/franco/Desktop/MileStone/src/lang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(langParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link langParser#fnc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(langParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(langParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(langParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssign(langParser.ReAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(langParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(langParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(langParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(langParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(langParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(langParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comFuncCall}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComFuncCall(langParser.ComFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chainND}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainND(langParser.ChainNDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDeclInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclInit(langParser.ForDeclInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forReassignInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForReassignInit(langParser.ForReassignInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyForInit(langParser.EmptyForInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forReassignStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForReassignStep(langParser.ForReassignStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyForStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyForStep(langParser.EmptyForStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exploreChain}
	 * labeled alternative in {@link langParser#nondetCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExploreChain(langParser.ExploreChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideCurly}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideCurly(langParser.InsideCurlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideBrake}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideBrake(langParser.InsideBrakeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insedeBrace}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsedeBrace(langParser.InsedeBraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bfcommand}
	 * labeled alternative in {@link langParser#brainfuck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfcommand(langParser.BfcommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bfsintax}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfsintax(langParser.BfsintaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bfloop}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfloop(langParser.BfloopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(langParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tostr}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTostr(langParser.TostrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(langParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(langParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(langParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExp(langParser.ArrayExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(langParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(langParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(langParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(langParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(langParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(langParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(langParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(langParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(langParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(langParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(langParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(langParser.IdContext ctx);
}