package testModifiers;

public class Public2 extends Public1{
	
	public static void main(String[] args) {
		System.out.println(a);
		meth();
		
		Public1 rr = new Public1();
		System.out.println(rr.b);
		
		Public1 ff = new Public1();
		ff.seth();
		
	}
	
	

}
