package it.unicam.cs.lc.lc2122.gedcom;

import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMLexer;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMParser;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.MyGEDCOMListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AncestorsDescendantsCalculator {

    private final String[] stream;

    public AncestorsDescendantsCalculator(String[] stream) {
        this.stream = stream;
    }

    public void execute() throws IOException {
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
    }

}