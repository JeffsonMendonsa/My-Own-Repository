package pract;

public class Grandchild extends Subclass {
	
	public Grandchild()
	{
		super();
		System.out.println("Grandchild 0 arg");
		
	}
	
	public Grandchild(int a)
	{
		super(6);
		System.out.println("Grandchild 1 arg");
	}
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Grandchild g0 = new Grandchild();
		
		Grandchild g1 = new Grandchild(33);
		
		Superclass s0 = new Superclass(32,'t',4.55);
		
	}

}
