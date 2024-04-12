package testpack1;

public class trial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static called
		look();
		
		//Non-static called
		trial1 dan = new trial1();
		dan.see1();
		
		System.out.println(number1);	//	static variable in same class
		System.out.println(trial1.number1);
		
		trial1 num2obj = new trial1();
		System.out.println(num2obj.number2);	//	Non-static Variable in same class
		
		System.out.println(trial2.aaa);		//	Static Variable from other class (class.variable)
		
		trial2 num2objotherclass = new trial2();
		System.out.println(num2objotherclass.bbb);		//Non-static from other class
		
		trial2 num3obj = new trial2();
		int num4obj = num3obj.bbb;
		System.out.println(num4obj);
		
		ryt();
		
	}
	public static void look() {
		System.out.println("First Static");
		int yy = 33;
		System.out.println(yy);
		
		trial1 l1 = new trial1();
		l1.see();
		
	}
	
	public void see()	{
		System.out.println("First Non-Static");
	}
	
	public static void look1()
	{
		System.out.println("New practice for Static");
		
	}
	
	public void see1()
	{
		System.out.println("New practice for Non-Static");
		
		int lo = 78;
		System.out.println(lo);
		
	}
	//--------------------------------------------------------------------------------------------------------//
	
	static int number1 = 50;
	
	int number2 = 60;
	
	static public void ryt()	{
		int fv = 44;
		
		System.out.println(fv);
	}
	
	public static void gang ()
	{
		System.out.println(69);
	}
	
	public void sang()
	{
		System.out.println("sang");
	}
	

	
}

