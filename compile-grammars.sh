cd resources/grammars
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
# simplify the use of the tool to test the generated code
alias grun='java org.antlr.v4.gui.TestRig'  
antlr4 -package lessparser LessLexer.g4
antlr4 -package lessparser LessParser.g4
