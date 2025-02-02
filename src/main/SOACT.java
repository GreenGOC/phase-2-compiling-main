package main;


import main.ast.nodes.Soact;
import main.grammar.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import main.visitor.NameAnalyzer;

public class SOACT {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SOACTLexer soactLexer = new SOACTLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(soactLexer);
        SOACTParser soactParser = new SOACTParser(tokens);
        Soact soact = soactParser.soact().soactRet;

        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(soact);

        System.out.println();
    }
}