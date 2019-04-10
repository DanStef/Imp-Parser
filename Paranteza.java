
public class Paranteza extends Statement{
	
	Statement inside;
	
	@Override
	public String toString() {
		
		inside.identLevel = identLevel + 1;
		
		
//		System.out.println("ParantezaLevel:" + identLevel);
		return "​<BracketNode> ()" + "\n" + getTabs(identLevel+1) + inside.toString();
	}

	@Override
	public Result getResult() {
		return inside.getResult();
	}

}
