package org.opal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws Exception {
    String inputFile = null;
    if (args.length > 0)
      inputFile = args[0];
    if (inputFile == null) {
      System.out.println("error: input file not specified");
      System.exit(1);
    }
    CharStream input = null;
    try {
      input = CharStreams.fromFileName(inputFile);
    } catch (IOException e) {
      System.out.println("error: input file not found");
      System.exit(1);
    }
    OpalLexer lexer = new OpalLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    OpalParser parser = new OpalParser(tokens);
    ParseTree tree = parser.translationUnit();
    System.out.println(tree.toStringTree(parser));
  }
}
