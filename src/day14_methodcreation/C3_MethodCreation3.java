package day14_methodcreation;

public class C3_MethodCreation3 {
	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini yazdiran bir method yazin
		// main method icinden cagirarark method'u cagirin
		
		ortalama(80, 60); // 2.'yi calistirir ve sonuc olarak 70 yazdirir
		ortalama(80, 60, 55); // 1.yi calistirir ve sonuc olarak 65 yazdirir
		
		
		
	} // main method sonu
	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		
		System.out.println("Girdiginiz uc sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);
	}
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("Girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		
	}


} // Class sonu
