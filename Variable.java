
public class Variable extends Statement{

	
	String name;
	Integer value;
	public Variable(String name) {
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "<VarNode> " + name.toString();
		
	}
	
	@Override
	public Result getResult() {
		
//		System.out.println("varName: " + name + " value:" + value);
		return new Result(Main.hmap.get(name), null);
	}

}
