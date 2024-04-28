package pract;

public class StringMethods {
	 
//	String s2 = "se";
	
	 public static void main(String[] args) {
		System.out.println();
		
		String s1 = "String tests";
		
		String s2 = "second";
		System.out.println(s1);
		
		System.out.println(s1.contains("tests"));
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1);
		
		s1 = s1.indent(3);
		System.out.println(s1);
				
//		aa.charAt(s1.charAt(1));
		
		//charAt
		
		System.out.println(s1.charAt(7)); 
		char c1 = s1.charAt(4);
		System.out.println(c1);
		
		//concat
//		
//		s1 = s1.concat(s2);
//		System.out.println(s1);
		
		//Lowercase
		
			System.out.println(s1.toLowerCase());
			
		//Uppercase
			
			System.out.println(s1.toUpperCase());
			
			
			String[] arr = s1.split(" ");
			System.out.println();
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
