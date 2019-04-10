build:
	jflex List.lexer
	javac *.java

run:
	java Main input

clean:
	rm *.class