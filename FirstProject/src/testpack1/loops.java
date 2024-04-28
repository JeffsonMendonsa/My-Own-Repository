package testpack1;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 50;
	
		if(i > 60)
			System.out.println("True");
		else
			System.out.println("False");
		
		int [] array = new int[5];
		
		array[0] = 50;
		array[4] = 1000;
		
		System.out.println(array[3]);
		
		int []troy = {509, 60, 788, 1000};
		System.out.println(troy[2]);
		
		int a = 45;
		int b = 55;
		
		if(a>b)	{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		int t = 0;
		
		while(t<8)
		{
			System.out.println("Trying");
			t++;
		}
		
		
		//do while
		int n = 1;
		do
		{
			System.out.println("do while true");
			n++;
		}
		while(n > 5);
		System.out.println("ggg");
	
		
		int aa = 10;
		int bb = 25;
		
		if(aa<bb)
		{
		System.out.println("if condition");
		}
		else if(aa==10)
		{
			System.out.println("else if condition");
		}

		else
		{
			System.out.println("else condition");
		}
		
	}
}
