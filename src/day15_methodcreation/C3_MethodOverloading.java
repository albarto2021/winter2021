package day15_methodcreation;

public class C3_MethodOverloading {

public static void main(String[] args) {
	
	// Java ayni isimle birden fazla metod olusturulursa buna overloading denir.
	// Overloading yapabilmnek için Method Signature'larinin farkli olmasi gerekir
	// Method Signature = isim + parametre sayisi + parametre data turu
	// bibbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir.
	// (Bire bir uyan varsa o methodu calistirir, Bire bir uyan yoksa en fazla uyan methodu kullanir
	// Eger kapsayan bir method da bulamazsa Java CTE verir.
	
		
		
		toplama(12,2); // 
		

	}

	public static void toplama(byte sayi1, byte sayi2) {
	System.out.println("byte method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(char char1, int char2) {
		System.out.println("char method sonucu : " + (char1+char2));
	}
	
	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + (str1+str2));
	}

}
