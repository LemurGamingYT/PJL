package core;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class Error {
    public Error(String ErrorType, String Message) {
        System.out.println(ErrorType + "Error: " + Message);
        System.out.println("Process finished with exit code 1");
        System.exit(1);
    }

    public static class ErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int col, String msg, RecognitionException e) {
            System.out.println("SyntaxError: unexpected '" + ((Token) offendingSymbol).getText() +
                    "' at line " + line + ", column " + col);
        }
    }
}
