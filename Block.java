import java.util.ArrayList;

public class Block extends Statement{

	ArrayList<Statement> statements = new ArrayList<>();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "{"+statements.toString()+"}";
		
		int size = statements.size() - 1;
		if(size < 0) {
			return "<BlockNode> {}";
		}
		
		
		String s = "<BlockNode> {}\n";
		int i;
		for(i = 0; i < statements.size() - 1;i++) {
			statements.get(i).identLevel = identLevel + 1;
			s+= getTabs(identLevel+1) + statements.get(i).toString() + "\n";
		}
		
		
//		System.out.println("size:"+size);
		statements.get(size).identLevel = identLevel + 1;
		s+= getTabs(identLevel+1) + statements.get(size).toString();
		
		return s;
	}

	@Override
	public Result getResult() {
		for(int i = 0; i < statements.size();i++) {
			statements.get(i).getResult();
		}
		
		return null;
	}
}
