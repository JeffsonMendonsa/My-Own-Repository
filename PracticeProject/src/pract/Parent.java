package pract;

public class Parent {
	
	public Parent()
	{
		System.out.println("Parent WITHOUT argument");
	}
		
//	public Parent(int a)
//	{
//		System.out.println("Parent 1 Argument: " + 65);
//		
//	}

	public Parent (int b , int t, int d)
	{
		int p = b * t + d;
		System.out.println(p);
	}
	
	public static void yulerie ()
	{
		System.out.println("Static in Constructor");
	}
	
	public void India ()
	{
		System.out.println("Non-Static Method");
	}
	
	static int a = 44;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Parent p1 = new Parent();
		
//		Parent p2 = new Parent(54);
//		
//		Parent p3 = new Parent(5,2,1);
//	
//		yulerie();
//		
//		Parent cv = new Parent(6);
//		cv.India();
//		
//		System.out.println(a);

		
	}

}
