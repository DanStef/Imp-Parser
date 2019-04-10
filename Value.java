
public class Value extends Statement{

	Integer value;
	public Value(int value) {
		
		this.value = value;
	}
	
	@Override
	public String toString() {

		return "<IntNode> " + value.toString();
	}
	
	@Override
	public Result getResult() {
		
		return new Result(value, null);
	}

}
