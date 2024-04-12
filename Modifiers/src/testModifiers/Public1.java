package testModifiers;

public class Public1 {
	
	static int a = 45;
	public int b = 55;
	
	protected static void meth()
	{
		System.out.println("meth");
		
	}
	
	public void seth()
	{
		System.out.println("seth");
	}
	
	public static void main(String[] args) {
		meth();
		System.out.println(Public1.a);
	}
	
	public void seth(int a)
	{
		System.out.println("seth");
	}
	
	public void seth(int a, char b)
	{
		System.out.println("seth");
	}
	
	public void seth(char a, int b)
	{
		System.out.println("seth");
	}
	
	
	
	
}
