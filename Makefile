CLASSPATH = lib/*:.

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

mdp: MarkdownParse.class
	java MarkdownParse Test/test-file$(file).md

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.java
	javac -cp $(CLASSPATH) MarkdownParseTest.java

test: MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest

TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java

tcm: TryCommonMark.class
	java -cp "lib/*:." TryCommonMark
