
public abstract class Statement {
	
	
	int identLevel;
	
	
	String getTabs(int x) {
		
		String s ="";
		
		for(int i = 0;i < x; i++) {
			s+= "\t";
		}
		
		return s;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public abstract  Result getResult();
	
	
}
