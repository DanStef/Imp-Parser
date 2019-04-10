
public class BoolVal extends Statement{
	
	Boolean value;
	
	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public Result getResult() {
		return new Result(null,value);
	}

}
