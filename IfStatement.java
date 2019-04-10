
public class IfStatement extends Statement{

	Statement condition;
	Statement case1,case2;
	
	
	@Override
	public String toString() {
		
		
//		if(condition == null || case1 == null || case2 == null) {
//			return "if...";
//		}
//		
		condition.identLevel = identLevel + 1;
		case1.identLevel = identLevel + 1;
		case2.identLevel = identLevel + 1;
		return "<IfNode> if\n" + getTabs(identLevel + 1) + condition.toString() + "\n" 
				               + getTabs(identLevel + 1) + case1.toString() + "\n"  
		                       + getTabs(identLevel + 1) + case2.toString();
		
	}


	@Override
	public Result getResult() {

		if(condition.getResult().bool) {
//			System.out.println("case1");
			case1.getResult();
		} else {
//			System.out.println("case2");
			case2.getResult();
		}
		return null;
	}
}
