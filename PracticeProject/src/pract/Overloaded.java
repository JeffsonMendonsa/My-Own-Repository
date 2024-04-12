package pract;

public class Overloaded {

	public void load()
	{
		System.out.println("L1 same class");
	}
	
	public void load(int a)
	{
		System.out.println("L2 same class");
	}
	
	
	
	public static void main(String[] args) {
		
		Overloaded oo = new Overloaded();
		oo.load();
		
		
//		load(9);
	}
	
	
	
	
	
	
	
	
	
	
	
}
