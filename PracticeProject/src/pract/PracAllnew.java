package pract;

public class PracAllnew extends PracAll {
	
			public void p1() {
				System.out.println("Childcl Overridden 0 arg");
			}
			
//			public void p1(int f) {
//				System.out.println("Childcl Overridden 1 arg");
//			}
			
			public void p2(int g, double h) {
				System.out.println("Childcl Overridden 2 arg");
			}
	
	
	public static void main(String[] args) {
		
		PracAll ParrefParobj = new PracAll();
		ParrefParobj.p1();
		ParrefParobj.p1(44);
		ParrefParobj.p2(55, 0.5);
		
		
		PracAll ParRefChiObj = new PracAllnew();
		ParRefChiObj.p1();
		ParRefChiObj.p1(3);
		ParRefChiObj.p2(0, 0);
		
		
		PracAllnew ChirefChiObj = new PracAllnew();
		ChirefChiObj.p1();
		ChirefChiObj.p1(35);
		ChirefChiObj.p2(4, 0);
		
		
			}

}
