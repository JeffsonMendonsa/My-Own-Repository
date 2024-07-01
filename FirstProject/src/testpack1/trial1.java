package testpack1;

public class trial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//static called
//		look();
//		
//		//Non-static called
//		trial1 dan = new trial1();
//		dan.see1();
//		
//		System.out.println(number1);	//	static variable in same class
//		System.out.println(trial1.number1);
//		
//		trial1 num2obj = new trial1();
//		System.out.println(num2obj.number2);	//	Non-static Variable in same class
//		
//		System.out.println(trial2.aaa);		//	Static Variable from other class (class.variable)
//		
//		trial2 num2objotherclass = new trial2();
//		System.out.println(num2objotherclass.bbb);		//Non-static from other class
//		
//		trial2 num3obj = new trial2();
//		int num4obj = num3obj.bbb;
//		System.out.println(num4obj);
//		
//		ryt();
//		
//		String s1 = "Hello String";
//		System.out.println(s1);
//		
//		String s2 = "hello string";
//				
//		System.out.println(s1.equalsIgnoreCase(s2));
//		
//		String truk = s1.replace('l', 'r');
//				System.out.println(truk);
//				
//			String rr =	s1.toUpperCase();
//			System.out.println(rr);
//			
//			System.out.println(s1.toLowerCase());
//			
//			String qw = "     trim";
//			System.out.println(qw.trim());
//			
//		
//		
//		
//	}
//	public static void look() {
//		System.out.println("First Static");
//		int yy = 33;
//		System.out.println(yy);
//		
//		trial1 l1 = new trial1();
//		l1.see();
//		
//	}
//	
//	public void see()	{
//		System.out.println("First Non-Static");
//	}
//	
//	public static void look1()
//	{
//		System.out.println("New practice for Static");
//		
//	}
//	
//	public void see1()
//	{
//		System.out.println("New practice for Non-Static");
//		
//		int lo = 78;
//		System.out.println(lo);
//		
//	}
//	//--------------------------------------------------------------------------------------------------------//
//	
//	static int number1 = 50;
//	
//	int number2 = 60;
//	
//	static public void ryt()	{
//		int fv = 44;
//		
//		System.out.println(fv);
//	}
//	
//	public static void gang ()
//	{
//		System.out.println(69);
//	}
//	
//	public void sang()
//	{
//		System.out.println("sang");
//	}
//	
		
//		for(int a = 0 ; a <= 100 ; a++)
//		{
//			if(a % 2 == 1)
//			{
//				System.out.println(a );
//			}
//		}
		
		 int count = 0;
	        int number = 2;  // Starting number to check for primes
	        
	        System.out.println("First 100 prime numbers:");

	        // Loop until we find 100 prime numbers
	        while (count < 100) {
	            if (isPrime(number)) {
	                System.out.println(number + " ");
	                count++;
	            }
	            number++;
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        // Check from 2 to sqrt(num) for divisibility
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Found a divisor, not a prime number
	            }
	        }
	        return true; // No divisors found, prime number
		
			
			
			
			
		}
}

