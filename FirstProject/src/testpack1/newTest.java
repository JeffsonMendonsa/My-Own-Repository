package testpack1;

public class newTest {
	

	
	public static void main(String[] args) {
		
		int age = 11;
		boolean cond = (age==13);
		
		
		if(cond){
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		testclass1.east();
		
		testclass1 rest = new testclass1();
		rest.west();
	
		
		
		Hello();
		newTest h = new newTest();
		h.hi();
		addition();
		data();
		testclass1.testing();
		
		System.out.println(a);		//static variable  
		
		newTest aa = new newTest();		//Non-static variable
		System.out.println(aa.b);
		
		System.out.println(testclass1.ttt);
		
		testclass1 ggg = new testclass1();
		System.out.println(ggg.uuu
				);
	}
	
	static int a = 6;
	
	int b = 7;
	
	static String abc = "srsrosr";
	
	
	static void Hello() {
		System.out.println("This is the output");
		System.out.println(abc);
		System.out.println(a);
		
	}
	public void hi() {
		System.out.println("height");
		
		
	}
	static void addition() {
		int a = 5;
		int b = 6;
		
		int c = a+b;
		System.out.println(c);
		
	}
	static void data() {
		System.out.println("Aux%");
	}
}
