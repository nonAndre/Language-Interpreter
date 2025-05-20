import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.text.StringEscapeUtils;
import value.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class lang extends langBaseVisitor<Value> {

    private boolean insideFunction = false;

    private final Conf conf;

    public lang (Conf conf) {
        this.conf = conf;
    }

    private ComValue visitCom(langParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(langParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    public final static Scanner scanner = new Scanner(System.in);

    private float visitFloatExp(langParser.ExpContext ctx) {
        try {
            return ((FloatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Float expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(langParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitProg(langParser.ProgContext ctx) {
        //return visitCom(ctx.com());
        for (var child : ctx.children) {
            if (child instanceof langParser.FncContext fncCtx) {
                visit(fncCtx);
            } else if (child instanceof langParser.ComContext comCtx) {
                visitCom(comCtx);
            }
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitIf(langParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(langParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());
        if (insideFunction) {
            conf.updateInsF(id,v);
        }else
        {
            conf.update(id, v);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitReAssign(langParser.ReAssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        if (insideFunction) {
            conf.updateInsF(id,v);
        }else
        {
            conf.update(id, v);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(langParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }


    @Override
    public ComValue visitWhile(langParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(langParser.OutContext ctx) {
        ExpValue<?> value = visitExp(ctx.exp());
        String result = value.toString();

        if (!(value instanceof StringValue)){
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }


        result = result.replaceAll("\"","");


        System.out.println(result);


        return ComValue.INSTANCE;
    }

    @Override
    public FloatValue visitFloat(langParser.FloatContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public BoolValue visitBool(langParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(langParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public FloatValue visitPow(langParser.PowContext ctx) {
        float base = visitFloatExp(ctx.exp(0));
        float exp = visitFloatExp(ctx.exp(1));

        return new FloatValue((float) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(langParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public FloatValue visitDivMulMod(langParser.DivMulModContext ctx) {
        float left = visitFloatExp(ctx.exp(0));
        float right = visitFloatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case langParser.DIV -> new FloatValue(left / right);
            case langParser.MUL -> new FloatValue(left * right);
            case langParser.MOD -> new FloatValue(left % right);
            default -> null;
        };
    }

    @Override
    public FloatValue visitPlusMinus(langParser.PlusMinusContext ctx) {
        float left = visitFloatExp(ctx.exp(0));
        float right = visitFloatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case langParser.PLUS -> new FloatValue(left + right);
            case langParser.MINUS -> new FloatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(langParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case langParser.EQQ -> new BoolValue(left.equals(right));
            case langParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(langParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if ( !insideFunction)
        {
            if (!conf.contains(id)) {
                System.err.println("Variable " + id + " used but never instantiated");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

                System.exit(1);
            }

            return conf.get(id);
        }
        else
        {
            if (!conf.containsInsF(id))
            {
                System.err.println("Variable " + id + " used but never instantiated");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

                System.exit(1);
            }

            return conf.getInsF(id);
        }



    }

    @Override
    public BoolValue visitCmpExp(langParser.CmpExpContext ctx) {
        float left = visitFloatExp(ctx.exp(0));
        float right = visitFloatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case langParser.GEQ -> new BoolValue(left >= right);
            case langParser.LEQ -> new BoolValue(left <= right);
            case langParser.LT  -> new BoolValue(left < right);
            case langParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(langParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case langParser.AND -> new BoolValue(left && right);
            case langParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitString(langParser.StringContext ctx) {
        return new StringValue(
                StringEscapeUtils.unescapeJava(
                        ctx.STRING().getText().substring(
                                1,
                                ctx.STRING().getText().length() - 1)));
    }

    @Override
    public FloatValue visitInput(langParser.InputContext ctx) {
        float val = scanner.nextFloat();
        return new FloatValue(val);
    }

    @Override
    public ComValue visitArrayAssign(langParser.ArrayAssignContext ctx) {
        String id = ctx.ID().getText();
        int index = (int) visitFloatExp(ctx.exp(0));
        ExpValue<?> value = visitExp(ctx.exp(1));

        ArrayValue array = conf.contains(id) && conf.get(id) instanceof ArrayValue existingArray
                ? existingArray
                : new ArrayValue(new ArrayList<>());

        List<ExpValue<?>> values = new ArrayList<>(array.getValues());

        while (values.size() <= index) {
            values.add(null);
        }

        values.set(index, value);
        conf.update(id, new ArrayValue(values));

        return ComValue.INSTANCE;
    }


    @Override
    public ExpValue<?> visitArrayExp(langParser.ArrayExpContext ctx) {
        String id = ctx.ID().getText();
        ArrayValue array = (ArrayValue) conf.get(id);

        if (!conf.contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.exit(1);
        }

        ExpValue<?> expValue = visitExp(ctx.exp());
        Object rawIndex = expValue.toJavaValue();

        if (!(rawIndex instanceof Float)) {
            System.err.println("Array index must evaluate to a float-compatible value.");
            System.exit(1);
        }

        int index = (int) ((Float) rawIndex).floatValue();
        ExpValue<?> result = array.getValues().get(index);

        if (result == null) {
            System.err.println("Uninitialized array element at index: " + index);
            System.exit(1);
        }

        return result;
    }


    @Override
    public StringValue visitConcat(langParser.ConcatContext ctx) {
        String value1 = visit(ctx.exp(0)).toString();
        String value2 = visit(ctx.exp(1)).toString();
        return new StringValue(value1 + value2);
    }

    @Override
    public Value visitTostr(langParser.TostrContext ctx) {
        return new StringValue(visit(ctx.exp()).toString());
    }

    @Override
    public ComValue visitFunc(langParser.FuncContext ctx) {
        String id = ctx.ID().getText();

       conf.registerFunction(id,ctx);

        return ComValue.INSTANCE;
    }


    @Override
    public Value visitBfcommand(langParser.BfcommandContext ctx) {
        String code = ctx.bf().getText();

        CharStream input = CharStreams.fromString(code);

        BrainfuckLexer lexer = new BrainfuckLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrainfuckParser parser = new BrainfuckParser(tokens);

        BrainfuckParser.MainContext tree = parser.main();

        Brainfuck brainfuck = new Brainfuck();
        brainfuck.visit(tree);

        return null;
    }

    @Override
    public ExpValue<?> visitFuncCall(langParser.FuncCallContext ctx) {
        String name = ctx.ID().getText();
        if (!conf.functionExists(name)) {
            System.err.println("Function " + name + " doesn't exist");
            System.exit(1);
        }

        langParser.FuncContext body = conf.functions.get(name);

        boolean isSlyarnFunction = body.brainfuck() != null;

        if (isSlyarnFunction) {
            visitBfcommand((langParser.BfcommandContext) body.brainfuck());
            return null;
        } else {
            insideFunction = true;

            String nameF = body.ID().getText();
            Pattern pattern = Pattern.compile("ret(\\w+);");
            Matcher matcher = pattern.matcher(body.getText());
            String getRetValName = matcher.find() ? matcher.group(1) : null;

            for (langParser.ComContext com : body.com()) {
                visitCom(com);
            }

            insideFunction = false;

            return conf.getInsF(getRetValName);
        }
    }

    @Override
    public Value visitChainND(langParser.ChainNDContext ctx) {
        return visit(ctx.nondetCom());
    }

    @Override
    public ComValue visitExploreChain(langParser.ExploreChainContext ctx) {


        List<langParser.NondetGroupContext> groups = ctx.nondetGroup();
        int randomIndex = new Random().nextInt(groups.size());

        visit(groups.get(randomIndex));
        return ComValue.INSTANCE;
    }


    @Override
    public ComValue visitInsideCurly(langParser.InsideCurlyContext ctx) {
        for (langParser.ComContext com : ctx.com()) {
            visit(com);
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitInsideBrake(langParser.InsideBrakeContext ctx) {
        for (langParser.ComContext com : ctx.com()) {
            visit(com);
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitInsedeBrace(langParser.InsedeBraceContext ctx) {
        for (langParser.ComContext com : ctx.com()) {
            visit(com);
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitFor(langParser.ForContext ctx) {
        if (ctx.forInit() != null) {
            visit(ctx.forInit());
        }

        while (visitBoolExp(ctx.exp())) {
            visit(ctx.com());

            if (ctx.forStep() != null) {
                visit(ctx.forStep());
            }
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitForDeclInit(langParser.ForDeclInitContext ctx) {

        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        if (insideFunction) {
            conf.updateInsF(id,v);
        }else
        {
            conf.update(id, v);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitForReassignStep(langParser.ForReassignStepContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        if (insideFunction) {
            conf.updateInsF(id,v);
        }else
        {
            conf.update(id, v);
        }
        return ComValue.INSTANCE;
    }




}
