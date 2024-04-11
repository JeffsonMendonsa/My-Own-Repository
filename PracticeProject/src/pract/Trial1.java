package pract;

import testModifiers.Public1;

public class Trial1 {
	
	public Trial1()
	{
		System.out.println("Constructor Withoud arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		Trial1 yack = new Trial1();
		yack.test2();
		
		
		
		
	}
	
	int k = 97;
	
	public static void test()
	{
		System.out.println("Static Method");
		
	}
	
	
	public void test2 ()
	{
		System.out.println("Non-Static Method");

		Trial1 HD = new Trial1();
		System.out.println(k);
		
		System.out.println(Child.k);
		
	}
	

}
