// Generated from /home/franco/Desktop/MileStone/src/lang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(langParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(langParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link langParser#fnc}.
	 * @param ctx the parse tree
	 */
	void enterFunc(langParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link langParser#fnc}.
	 * @param ctx the parse tree
	 */
	void exitFunc(langParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(langParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(langParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssign(langParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssign(langParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterReAssign(langParser.ReAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitReAssign(langParser.ReAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(langParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(langParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(langParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(langParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(langParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(langParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterFor(langParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitFor(langParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code out}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterOut(langParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code out}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitOut(langParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterReturn(langParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitReturn(langParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comFuncCall}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterComFuncCall(langParser.ComFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comFuncCall}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitComFuncCall(langParser.ComFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chainND}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterChainND(langParser.ChainNDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chainND}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitChainND(langParser.ChainNDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forDeclInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForDeclInit(langParser.ForDeclInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forDeclInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForDeclInit(langParser.ForDeclInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forReassignInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForReassignInit(langParser.ForReassignInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forReassignInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForReassignInit(langParser.ForReassignInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterEmptyForInit(langParser.EmptyForInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link langParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitEmptyForInit(langParser.EmptyForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forReassignStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterForReassignStep(langParser.ForReassignStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forReassignStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitForReassignStep(langParser.ForReassignStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyForStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterEmptyForStep(langParser.EmptyForStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyForStep}
	 * labeled alternative in {@link langParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitEmptyForStep(langParser.EmptyForStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exploreChain}
	 * labeled alternative in {@link langParser#nondetCom}.
	 * @param ctx the parse tree
	 */
	void enterExploreChain(langParser.ExploreChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exploreChain}
	 * labeled alternative in {@link langParser#nondetCom}.
	 * @param ctx the parse tree
	 */
	void exitExploreChain(langParser.ExploreChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideCurly}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void enterInsideCurly(langParser.InsideCurlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideCurly}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void exitInsideCurly(langParser.InsideCurlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideBrake}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void enterInsideBrake(langParser.InsideBrakeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideBrake}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void exitInsideBrake(langParser.InsideBrakeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insedeBrace}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void enterInsedeBrace(langParser.InsedeBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insedeBrace}
	 * labeled alternative in {@link langParser#nondetGroup}.
	 * @param ctx the parse tree
	 */
	void exitInsedeBrace(langParser.InsedeBraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bfcommand}
	 * labeled alternative in {@link langParser#brainfuck}.
	 * @param ctx the parse tree
	 */
	void enterBfcommand(langParser.BfcommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bfcommand}
	 * labeled alternative in {@link langParser#brainfuck}.
	 * @param ctx the parse tree
	 */
	void exitBfcommand(langParser.BfcommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bfsintax}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void enterBfsintax(langParser.BfsintaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bfsintax}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void exitBfsintax(langParser.BfsintaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bfloop}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void enterBfloop(langParser.BfloopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bfloop}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void exitBfloop(langParser.BfloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nil}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void enterNil(langParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link langParser#bf}.
	 * @param ctx the parse tree
	 */
	void exitNil(langParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tostr}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTostr(langParser.TostrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tostr}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTostr(langParser.TostrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(langParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(langParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(langParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(langParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(langParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(langParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayExp(langParser.ArrayExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayExp(langParser.ArrayExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConcat(langParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConcat(langParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFloat(langParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFloat(langParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInput(langParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInput(langParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivMulMod(langParser.DivMulModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivMulMod(langParser.DivMulModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(langParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(langParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(langParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(langParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCmpExp(langParser.CmpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCmpExp(langParser.CmpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(langParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(langParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(langParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(langParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPow(langParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPow(langParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(langParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(langParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(langParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(langParser.IdContext ctx);
}