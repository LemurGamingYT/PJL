import core.Error;
import core.ErrorListener;
import core.Visitor;
import core.gen.PJLLexer;
import core.gen.PJLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws IOException {
        var start_time = Instant.now();

        var code = CharStreams.fromFileName("Test.pjl");

        var lexer = new PJLLexer(code);
        var tokens = new CommonTokenStream(lexer);

        var parser = new PJLParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new Error.ErrorListener());
        var tree = parser.parse();

        var visitor = new Visitor<>();
        visitor.SetReprs();
        visitor.SetFuncs();
        visitor.visit(tree);

        var end_time = Instant.now();
        var elapsed = end_time.toEpochMilli() - start_time.toEpochMilli();
        System.out.println("Total time to execute -> " + elapsed + "ms");
        
        System.out.println("\nProcess finished with exit code 0");
    }
}
