package pract;

public class Subclass extends Superclass{

	public Subclass() 
	{
		System.out.println("Subclass No argument");
	}
	public Subclass(int a)
	{
		super(4);
		System.out.println("Subclass 1 argument");
	}
	
	public Subclass (int a, int b)
	{
		super(4,'t',90.66);
		System.out.println("Subclass 2 argument");
	}

	public static void main(String[] args) 
	{
		Subclass Child0 = new Subclass();
		
		Subclass Child1 = new Subclass(1);
		
		Subclass Child2 = new Subclass(1,2);
		
	}
}
