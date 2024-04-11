package testModifiers;

public class Public2 {
	
	public static void main(String[] args) {
		System.out.println(Public1.a);
		Public1.meth();
		
		Public1 rr = new Public1();
		System.out.println(rr.b);
		
		Public1 ff = new Public1();
		ff.seth();
		
	}
	
	

}
