package pract;

public class Overridden extends Overloaded{

	public void load()
	{
		System.out.println("L1 Overridden");
	}
	
	public void load(int a)
	{
		System.out.println("L2 Overridden");
	}
	
	public void load(int a, boolean r)
	{
		System.out.println("L3 Overridden");
	}
	
	public static void main(String[] args) {
		
		Overloaded o1 = new Overloaded();
		o1.load();
		o1.load(0);
		
		
		Overridden p1 = new Overridden();
		p1.load();
		o1.load(6);
		
		Overloaded l1 = new Overridden();
		l1.load();
		o1.load(6);
		o1.load(0, true);
		
		
		
		
		
		
		
//		
//		Overloaded jj = new Overridden();
//		jj.load(56, false);
//		
//		
//		Overloaded yy = new Overloaded();
//		yy.load();
//		yy.load(888);
//		yy.load(44, true);
//		
//		Overridden dd = new Overridden();
//		dd.load();	
//		dd.load(67);
//		dd.load(0, false);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
