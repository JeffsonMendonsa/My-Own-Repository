package pract;

public class Superclass {

	public Superclass()
	{
		System.out.println("Superclass No argument");
	}
	
	public Superclass(int a)
	{
		System.out.println("Superclass 1 argument");
	}
	
	public Superclass(int a, char b, double r)
	{
		System.out.println("Superclass 3 argument");
	}
	
	public static void main(String[] args) 
	{
		Superclass Par0 = new Superclass();
		
		Superclass Par1 = new Superclass(6);

		Superclass Par3 = new Superclass(77,'t',55.77);
	}
}
