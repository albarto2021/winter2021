package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}
	
	/*
	 Inheritance'da constructor olusturdugumuzda Java'nin otomotik olarak constructor'a
	 	koydugu super(); keyword onemlidir.
	 Super() keyword default constructor gibidir. Biz gormesekte calisir, ancak yerine
	 	baska bir keyword yazarsak etkisiz hale gelir.
	 *** extends varsa yerine birsey yazmadikca super() calisir.... 
	 */


	public static void main(String[] args) {
		
		Memur obj1= new Memur(2400);
		

	}



}
