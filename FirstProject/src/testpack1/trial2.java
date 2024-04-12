package testpack1;

public class trial2 extends trial1{
	
	public trial2()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static from a different class
		trial1.look1();
		
		//non-static from a different class
		trial1 man = new trial1();
		man.see1();
		trial2 red = new trial2();
		System.out.print(red.bbb);
		System.out.println();
		System.out.println(abd);
		
		trial1 sung = new trial1();
		sung.sang();
		trial1.gang();
		
		trial1 jj = new trial1();
		jj.sang();
		
		trial1 ll = new trial2();
		jj.sang();
		
		trial2 tt = new trial2();
		jj.sang();
		
	}
	
	static int aaa = 555;
	int bbb = 666;
	
	double ccc;
	
	static String abd = "qqqqqq";
	
	
	
}
