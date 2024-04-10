package testpack1;

public class trial2 {
	
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
	}
	
	static int aaa = 555;
	int bbb = 666;
	
	double ccc;
	
	static String abd = "qqqqqq";
	
	
}
