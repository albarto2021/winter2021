package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*
		 Soru : Verilen bir fiyat icin %10 , %20 , %25 indirim yapan uc method olusturun.
		 	- Mtheod'a indirim uygulayip fiyati main method'a yazdirin
		 	- Method'lari arka arkaya cagirip calistiklarini kontrol edin		 	
		 */
		
		double fiyat= 100;
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat));
		System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat));
		System.out.println("%25 indirimli fiyat : " + indirimUygula25(fiyat));
		System.out.println("Method Call'dan sonra fiyat : " + fiyat);		
	}

	public static Double indirimUygula25(double fiyat) {
		
		fiyat*=0.75;		
		return fiyat;
	}

	public static Double indirimUygula20(double fiyat) {
		
		fiyat*=0.80;		
		return fiyat;
	}

	public static Double indirimUygula10(double fiyat) {
		
		fiyat*=0.90;		
		return fiyat;
	}
}
