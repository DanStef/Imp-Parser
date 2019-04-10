
public class Division extends Arith{

	@Override
	public String toString() {
		left.identLevel = identLevel + 1;
		right.identLevel = identLevel + 1; 
		
		return "<DivNode> /\n" + getTabs(identLevel+1) + left.toString() + "\n"
		                       + getTabs(identLevel+1) + right.toString();
	}
	
	@Override
	public Result getResult() {
		
		return new Result(left.getResult().number / right.getResult().number, null);
	}

}
