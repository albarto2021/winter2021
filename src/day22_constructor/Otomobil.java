package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek constructor'i parametreli olarak olusturabiliriz.
		
	}
	// biz bir constructor olusturdugumuzda Java default olani yok eder
	// dolayisi ile bir bir constructor olusturdugumuzda mutlaka
	// default constructor'in yerine de bir constructor yazmaliyiz.
	public Otomobil() { // default constructor'in yerine bunu yazmaliyiz.
		
	}
	// ONEMLÝ NOT : Default constructor'dan baska bir constructor yazdigimizda
	// java default edeni yok ettigi icin MUTLAKA biz default yerine de constructor yazmaliyiz.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
