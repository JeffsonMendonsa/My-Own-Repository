package pract;

public class Overloaded {

	public void load()
	{
		System.out.println("L1 Overloaded");
	}
	
	public void load(int a)
	{
		System.out.println("L2 Overloaded");
	}
	
	
	public void load(int a, boolean r)
	{
		System.out.println("L3 Overloaded");
	}
	
	
	public static void main(String[] args) {
		
		Overloaded oo = new Overloaded();
		oo.load();
		
		
//		load(9);
	}
	
	
	
	
	
	
	
	
	
	
	
}
