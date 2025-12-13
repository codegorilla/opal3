package org.opal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
  public static void main(String[] args) throws Exception {
    String inputString = "package main; import hello.world;";
    CharStream input = CharStreams.fromString(inputString);
    OpalLexer lexer = new OpalLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    OpalParser parser = new OpalParser(tokens);
    ParseTree tree = parser.translationUnit();
    System.out.println(tree.toStringTree(parser));
  }
}
