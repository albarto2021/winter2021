package day42_AbstractClass;

public abstract class Personel {
	
	// bir class'i abstract yapmak icin class keyword'unde once
	// abstract yazmak yeterlidir.
	
	// abstract class'in icinde variable olabilir mi?
	// olabilir	
	public String isim = "Yasin";
	
	// variable'ler abstract olur mu?
	// olmaz variable'de body yok
	// public abstract int sayi=10;
	
	// abstract class'in tum concrete child'lari abstract class'daki
	// tum dinamik ozellikleri yani methodlari
	// override etmek zorundadir.
	
	// bir method abstract olur mu nasil yapilir?
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	// Bir abstract class'da concrete method yazilabilir.
	// Bir abstract class'da ve  concrete method'lar olabilir
	// concrete child class'lar abstract 'method'lari override ETMEK ZORUNDADIR ama
	// concrete methodlarin override edilmesi zorunlu degildir
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigorta kapsamindadir.");
		
	}
	

}
