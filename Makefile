CLASSPATH = .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

mdp: MarkdownParse.class
	java MarkdownParse Test/test-file$(file).md

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.java
	javac -cp $(CLASSPATH) MarkdownParseTest.java

test: MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest
