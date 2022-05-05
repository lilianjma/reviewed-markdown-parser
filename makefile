.PHONY: test run

FILE ?=  test-file.md
CPATH=.:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar
TEST_ENTRYPOINT ?= org.junit.runner.JUnitCore

default: test

MarkdownParse.class: MarkdownParse.java
	javac -cp $(CPATH) MarkdownParse.java

MarkdownParseTest.class: MarkdownParse.class
	javac -cp $(CPATH) MarkdownParseTest.java

test: MarkdownParseTest.class
	java -cp $(CPATH) $(TEST_ENTRYPOINT) MarkdownParseTest

clean:
	rm -rf *.class

run: MarkdownParse.class
	java MarkdownParse $(FILE)

