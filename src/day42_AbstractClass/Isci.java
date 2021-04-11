package day42_AbstractClass;

public class Isci extends Personel{

	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla(); // isciler icin maas 500 TL
		isci1.mesaiBilgisi(); // isciler gunluk 8 saat calisir
		isci1.isim="Rumeysa"; // abstract parent class'daki variable2leri istersem kullanirim
		System.out.println(isci1.isim); // Rumeysa
		// System.out.println(isim);
		isci1.ozelSigorta(); // abstract parent class'daki concrete methodu istersem kullanbilirz
							 // Bu personel ozel sigorta kapsamindadir
							// Bu method'u override etmedik ama parent-child iliskisinden ile kullanabildik

	}

	@Override
	public void maasHesapla() {
		// parent class'daki abstract method'u implement (uyarlama) etti
		// 1- sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
		// 	  implament etmelisin
		// 2- parent class'daki method'da body olmadigi icin onu kullanmanin bir anlami yok
		// biz bir child class'da body olan method (concrete) kullanip islem yapmaliyiz
		System.out.println("isciler icin maas 5000 TL");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calisir");
		
	}

}
