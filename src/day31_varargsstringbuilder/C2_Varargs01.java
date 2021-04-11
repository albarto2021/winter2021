package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		
		// Verilen iki sayiyi toplayan ve sonucu yazdiran method yaziniz.
		
		int sayi1= 10;
		int sayi2= 20;
		int sayi3= 30;
		
		toplama(sayi1,sayi2);  // method call
		
		// Verilen uc sayiyi toplayan ve sonucu yazdiran method yaziniz.
		toplama(sayi1,sayi2,sayi3);
		
		// oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		toplama(2,3); // iki sayinin toplami methodu
		toplama(2,5,8); // uc sayinin toplami methodu
		
		// istedigimiz kadar sayiyi yazabilecigimiz method'u olusturabilmemiz icin
		// Java Varargs methodu olusturur
	}

	private static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));		
	}

	private static void toplama(int sayi1, int sayi2) {
		
		System.out.println("iki sayinin toplami : " + (sayi1+sayi2));		
	}
}
