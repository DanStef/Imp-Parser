import java.io.*;
import java.util.HashMap;



public class Main {

	
	static HashMap<String,Integer> hmap = new HashMap<>();
	
	public static void main(String[] args) throws Exception{
		
//		hmap.put("a", null);
		
		Yylex lexer = new Yylex(new FileReader(args[0]));
		System.out.println("here");
		lexer.yylex();
		
		
		for(Statement s : lexer.stack) {
			s.identLevel = 0;
		}
//		System.out.println(lexer.stack.toString());
//		System.out.println(lexer.stack.size());

		
		for(Statement s : lexer.stack) {
			System.out.println(s.toString());
		}
		
		for(Statement s : lexer.stack) {
			s.getResult();
		}
		
		System.out.println(hmap.toString());
	}

}