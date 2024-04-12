package pract;

public abstract class InterChild1 implements Inter1, Inter2 {
	
	@Override
	public void i1() {
		// TODO Auto-generated method stub
		System.out.println("i1 inter1");
	}

	@Override
	public void i2() {
		// TODO Auto-generated method stub
		System.out.println("i2 inter1");
	}

	public static void main(String[] args) {
//		InterChild1 ii = new InterChild1();
//			ii.i1();
	}

	@Override
	public void i3() {
		// TODO Auto-generated method stub
		System.out.println("i3 inter1");
	}

	@Override
	public void i4() {
		// TODO Auto-generated method stub
		System.out.println("i4 inter1");
	}

	@Override
	public void i5() {
		// TODO Auto-generated method stub
		System.out.println("i5 inter1");
	}
	
public void i6() {
		
		System.out.println("i6 inter 2");
	}


}
