package testModifiers;

public class Public1 {
	
	static int a = 45;
	
	public static void meth()
	{
		System.out.println("meth");
	}
	public static void main(String[] args) {
		meth();
		System.out.println(Public1.a);
	}
	
	
	
	
	
	
	
	
	
}
