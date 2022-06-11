package it.unicam.cs.lc.lc2122.gedcom;

import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMLexer;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMParser;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.MyGEDCOMListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input;
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
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
