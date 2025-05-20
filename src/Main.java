import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        langLexer lexer = new langLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        langParser parser = new langParser(tokenStream);

        ParseTree tree = parser.prog();

        lang interpreter = new lang(new Conf());
        interpreter.visit(tree);
    }
}