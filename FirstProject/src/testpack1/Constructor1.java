package testpack1;			 

public class Constructor1 {

	public Constructor1()
	{
		System.out.println("Hello");
	}
	
	public Constructor1(int s)
	{
		System.out.println();
	}
	
	public Constructor1(int a, int b)
	{
		int c = a * b *  b ;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Constructor1 a = new Constructor1();
		Constructor1 b = new Constructor1(76);
		Constructor1 c = new Constructor1(3,2);
		
		
		
		

		
	}

}
