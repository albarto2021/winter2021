package day03;

import java.util.Scanner;

public class C1_Scanner1 {
	public static void main(String[] args) {
		
		// kullanicidan isim ve soyisimini isteyip
		// isim: mehmet
		// soyisim: bulutluoz
		// kursumuza kaydiniz alinmistir, tesekkur ederiz
		// seklinde dsddyazdirin
		
		// Scanner : Kullanicidan bilgi almak i�in kullaniriz.
		// 3 adimda Scanner olu�turulur
		// 1. adim Scanner objesi olusturuyoruz
		// Scanner in calismasi icin Java.util(utilities) kutuphanesinden ilgili
		//kismi calismamiza import etmeliyiz...
		
		Scanner scan = new Scanner(System.in);
		
		// 2. adim kullaniciya ne istedigimizi belirten bir mesaj yazmaliyiz
		
		System.out.println("L�tfen sadece isminizi giriniz");	
		
		// 3. adim bir variable olu�turup kullanicinin girdigi degeri atayacagiz
		
		String name = scan.nextLine();
		
		System.out.println("L�tfen sadece soyisminizi giriniz");
		
		// String surname = scan.next(); bu sekilde yazarsak sadece ilk kelimeyi alir sonrakilerini yazmaz.
		
		String surname = scan.nextLine();
		
		// benden istenen sekilde ciktiyi yazdirabiliriz.
		// geer yazdiracagimiz yazi sabit bir yazi ise " " arasinda yazdiriyoruz
		// eger bir variable a atanmis degeri yazdirmak istersek
		// " " olmadan sadece variable ismini yaziyoruz.
		
		System.out.println("Isminiz: " + name);
		System.out.println("Soyisminiz: "+ surname);
		System.out.println("kursumuza kaydiniz alinmistir, tesekkur ederiz");
		
		scan.close();
	}
	
	

}
