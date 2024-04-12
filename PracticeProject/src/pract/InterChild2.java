package pract;

public class InterChild2 extends InterChild1{

	public void i3() {
		// TODO Auto-generated method stub
	
		System.out.println("i3");
	}
public void i6() {
		
		System.out.println("i6 inter 2");
	}
	
	 
	public static void main(String[] args) {
		
		InterChild2 yy = new InterChild2();
		yy.i3();
		
		InterChild2 oo = new InterChild2();
		oo.i1();
		oo.i2();
		oo.i6();
		
		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		InterChild1 pp = new InterChild2();
		pp.i1();
		pp.i2();
		pp.i3();
		
		Inter1 uu = new InterChild2();
		uu.i1();
		
		uu.i6();
		
//		Inter ll = new InterChild1();
		
//		Object mm = new Inter();
//		mm.notify();
		
//		Inter2 jh = new
	}



	
	

	
}
