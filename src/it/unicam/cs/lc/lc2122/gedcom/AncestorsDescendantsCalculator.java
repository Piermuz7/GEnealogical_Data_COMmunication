package it.unicam.cs.lc.lc2122.gedcom;

import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMLexer;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Set;

/**
 * An ancestors or descendants calculator implementation.
 * This Singleton calculator needs only a stream of characters which corresponding to the GEDCOM data.
 *
 * @author Piermichele Rosati
 */
public class AncestorsDescendantsCalculator {

    private static AncestorsDescendantsCalculator instance;

    /**
     * Invisible constructor.
     */
    private AncestorsDescendantsCalculator() {
    }

    /**
     * Factory method for the obtaining the {@link AncestorsDescendantsCalculator} instance.
     *
     * @return the instance of this Singleton
     */
    public static AncestorsDescendantsCalculator getInstance() {
        if (instance == null)
            instance = new AncestorsDescendantsCalculator();
        return instance;
    }

    /**
     * Executes lexical, syntax, and semantic analysis of the specified stream.
     * Returns a result of the execution.
     *
     * @param stream the stream of characters
     * @return a result set of the execution.
     * @throws IOException if an I/O error occurs
     */
    public Set<String> execute(String[] stream) throws IOException {
        CharStream input;
        String inputFile = null;
        if (stream.length > 0)
            inputFile = stream[0];
        if (inputFile != null)
            input = CharStreams.fromFileName(inputFile);
        else
            input = CharStreams.fromStream(System.in);
        GEDCOMLexer lexer = new GEDCOMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GEDCOMParser parser = new GEDCOMParser(tokens);
        ParseTree parseTree = parser.s();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGEDCOMListener myGEDCOMListener = new MyGEDCOMListener();
        walker.walk(myGEDCOMListener, parseTree);
        return myGEDCOMListener.getResult();
    }

}
