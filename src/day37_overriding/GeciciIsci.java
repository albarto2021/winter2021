package day37_overriding;

public class GeciciIsci extends Isci{
	
	public String calistigiBolum="Yemekhane";

	public static void main(String[] args) {
		
		// Overriding (gecersiz kilma)
		// bir child class'da parent class'dan miras alinan method'u
		// degistirmeye overriding denir.	
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai(); // 

	}
	// overriding yapmak icin parent class'daki method signature'i
	// ile child class'da bir method olusturulur.
	// signature ayni oldugundan sedec body degisir
	// boylece parent class'daki method child class icin gecerszi hale gelir
	
	public int maasHesapla() {
		return 30*8*10;
	}
	@Override // annotation
	public void mesai() {		
		// super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}
	
	// annotation : dipnot, aciklama
	// Java 25. satirda kodu inceleyenler icin bir aciklama getiriyor
	
	// anotation olmasi ile olmamasi arasindaki fark 
	// anotation sadece bir aciklama degildir.
	// override yaptigimiz method'u surekli kontrol eder ve parent class'daki
	// overriden method signature' degistirilirse CTE verdiri.
	
	// eger override edilenparent class'daki method(overriden)'un da
	// calismasini istiyorsak overriding method'a super.overridenMethodIsmi yazariz
	// eger overriding method'da super. yazilmazsa 
	// overriden method calismaz.
	
	// Access Modifier
	// Child Parent'i sinirlandiramaz
	// Yani overriding method'un access modifier'i overridden method'un access modifier'inden 
	// daha dar olmaz.,
	
	// Return Type
	// overridden method'un return type'i primitive veya void ise 
	// overriding method'un return type'i de ayni olmali
	// eger return type primitive degilse
	// (overridding method'un return type'i) IS-A (overridden method'un return type'i) olmalidir

}
