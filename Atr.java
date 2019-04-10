
public class Atr extends Statement{
	
	Variable v;
	Statement value = null;
	
	
	@Override
	public String toString() {

		value.identLevel = identLevel + 1;
		v.identLevel = identLevel + 1;
		
		return "<AssignmentNode> =\n" +getTabs(identLevel + 1)+ v.toString()+"\n" 
		                              + getTabs(identLevel + 1)+ value.toString();
	}
	
	@Override
	public Result getResult() {
		
		
		v.value = value.getResult().number;
//		System.out.println(v.name +" ->" + v.value);
		Main.hmap.put(v.name, v.value);
		return null;
	}


}
