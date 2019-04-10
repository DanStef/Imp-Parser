
public class MaiMare extends Statement{

	Statement left,right;
	
	@Override
	public String toString() {
		
		left.identLevel = identLevel + 1;
		right.identLevel = identLevel + 1; 

		return "<GreaterNode> >\n" + getTabs(identLevel+1) + left.toString() + "\n"
		                      	   + getTabs(identLevel+1) + right.toString();
	}

	@Override
	public Result getResult() {
//		System.out.println("left:" + left.getResult().number);
		return new Result(null, left.getResult().number > right.getResult().number);
	}
	
}
