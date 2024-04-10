package testpack1;

public class constructor {

	public constructor()
	{
		System.out.println("Constructor");
	}
	
	public constructor(int a, int b)
	{
		int c = a * b;
		System.out.println(c);
	}
	
	public constructor(char w)
	{
		this(5,100);
		System.out.println("Character");
	}
	
	public constructor(int g, char h, double j)
	{
//		this(78,'o',9.8);
		System.out.println("3 datatypes");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructor a = new constructor();
		
		constructor b = new constructor(5,5);
		
		constructor c = new constructor('t');
		
		constructor d = new constructor(5, 'g', 6.7);
		
		
		
		
	}

}
