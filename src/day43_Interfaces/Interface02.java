package day43_Interfaces;

public interface Interface02 {
	
	// Soru : Buradaki default ve statix bizim bildigimiz default ve static mi?
	// Cevap : Hayir
	
	public default void deneme() {
		System.out.println("default keyword'lu method calisti");
		
	}
	
	// bizim bidigimiz default acces modifier'di
	// bir method'da birden fazla access modifier olur mu?
	// bizim interfazce'de olusturdugumuz tum method'lar public'tir
	// interface'de default keyword kullanarak concrete olusturabiliriz.
	// burada ki default keyword'u access möodifier degil 
	// Java'nin ozel bir cozumudur.
	// Burada ki default keyword  basina yazidigi method'un concrete oldugunu belirtir
	
	static void denem2() {
		System.out.println("static keyword'lu method calisti");
		
		// yukarida default keyword'u icin yazdiklarimiz static icinde gecerlidir
		
		// static ve default keyword'u kullanarak olusturdugumuz method'lar
		// override edilmek ZORUNDA DEGILDIR		
	}
}
	
