import java.util.Scanner;

public class Brainfuck extends BrainfuckBaseVisitor<Character> {

    private  byte[] memory = new byte[30000]; // Brainfuck memory tape
    private int ptr = 0;                         // Data pointer
    private static final Scanner console = new Scanner(System.in);
    private boolean outputAsDigit = false;

    @Override
    public Character visitMain(BrainfuckParser.MainContext ctx) {
        return visit(ctx.com());
    }

    @Override
    public Character visitLt(BrainfuckParser.LtContext ctx) {
        ptr--;
        if (ptr < 0) {
            throw new RuntimeException("Memory pointer moved before start of tape");
        }
        return visitChildren(ctx);
    }

    @Override
    public Character visitGt(BrainfuckParser.GtContext ctx) {
        ptr++;
        if (ptr >= memory.length) {
            throw new RuntimeException("Memory pointer overflowed tape");
        }
        return visitChildren(ctx);
    }

    @Override
    public Character visitPlus(BrainfuckParser.PlusContext ctx) {
        memory[ptr]++;
        return visitChildren(ctx);
    }

    @Override
    public Character visitMinus(BrainfuckParser.MinusContext ctx) {
        memory[ptr]--;
        return visitChildren(ctx);
    }

    @Override
    public Character visitDot(BrainfuckParser.DotContext ctx) {

        if (!outputAsDigit) {
            System.out.print((char) memory[ptr]);
        }
        else
        {
            System.out.print("Result: "+memory[ptr]+"\n");
        }
        outputAsDigit = false;

        return visitChildren(ctx);
    }

    @Override
    public Character visitComma(BrainfuckParser.CommaContext ctx) {
        System.out.print(":><: ");
        memory[ptr] = (byte)(console.next().charAt(0)-'0');
        outputAsDigit = true;
        return visit(ctx.com());
    }

    @Override
    public Character visitLoop(BrainfuckParser.LoopContext ctx) {
        while (memory[ptr] != 0) {
            visit(ctx.com(0));
        }
        return visit(ctx.com(1));
    }


    @Override
    public Character visitNil(BrainfuckParser.NilContext ctx) {
        return ' ';
    }
}
