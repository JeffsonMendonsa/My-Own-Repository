package pract;

public class Child extends Parent{
	 
	public Child (int y)
	{
		System.out.println("Child 1 argument");
	}
	
	public Child(int a, int b)
	{
//		super(5,4,3);
		System.out.println("Child 2 argument");
	}
	
	static int k = 45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c1 = new Child(8);
		
		Child c2 = new Child(8,-6);
		
//		yulerie();
//		
//		Parent uv = new Parent(7);
//		uv.India();
//		System.out.println(Child.f);
//		
//		Parent ui = new Child(5);
		
	}

	public final static int f = 33;
}
