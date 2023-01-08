package core;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public interface ErrorListener {
    void syntaxError(Recognizer<?, ?> recognizer, Token offendingSymbol,
                     int line, int col, String msg, RecognitionException e);
}
