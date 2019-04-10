
public class Neg extends Statement{

	
	Statement s;
	
	@Override
	public String toString() {

		s.identLevel = identLevel + 1;
		return "​<NotNode> !" + "\n" + getTabs(identLevel+1) + s.toString();
	}

	
	@Override
	public Result getResult() {
		
		return new Result(null, !s.getResult().bool);
	}
	
}
