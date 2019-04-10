
public class And extends Statement{

	Statement left,right;
	
	@Override
	public String toString() {
		
		left.identLevel = identLevel + 1;
		right.identLevel = identLevel + 1;
		
		return "<AndNode> &&\n" +getTabs(identLevel + 1)+ left.toString()+"\n" 
		                       + getTabs(identLevel + 1)+ right.toString();
	}

	@Override
	public Result getResult() {
		return new Result(null, left.getResult().bool && right.getResult().bool);
	}
}
