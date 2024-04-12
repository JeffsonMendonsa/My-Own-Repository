package pract;

public class Overridden extends Overloaded{

	public void load()
	{
		System.out.println("L1 different class/Child class");
	}
	
	public static void main(String[] args) {
		
		
		
		Overloaded jj = new Overridden();
		jj.load();
		
		Overloaded yy = new Overloaded();
		yy.load();
		
		Overridden dd = new Overridden();
		dd.load();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
