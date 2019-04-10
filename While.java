
public class While extends Statement{

	Statement cond,block;
	
	@Override
	public String toString() {
		
//		if(cond == null || block==null) {
//			return "while(...)";
//		}
//		
//		return "while(" + cond.toString() + ")do ("+block.toString()+")";
		
		cond.identLevel = identLevel + 1;
		block.identLevel = identLevel + 1;
		return "<WhileNode> while\n" + getTabs(identLevel + 1) + cond.toString() + "\n" 
				               + getTabs(identLevel + 1) + block.toString();
	}

	@Override
	public Result getResult() {
		while(cond.getResult().bool) {
			block.getResult();
		}
		
		return null;
	}
}
