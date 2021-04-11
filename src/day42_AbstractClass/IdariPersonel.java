package day42_AbstractClass;

public class IdariPersonel extends Personel {
	// extends Personel yazarak Abstract Personele concrete bir child olsyturduk
	// ve Java bize CTE verdi
	// cozum olarak urettigi 2 ihtimal var
	// 1- Unimplement (uyarlanmamis) methodlari uyarla
	// 2- Ya da Personel class'indan abstract kelimesini kaldir
	// Bu class'in calisabilmesi icin 2 islemden birini yapmamiz lazim

	public static void main(String[] args) {
		

	}
	
	// concrete bir class'da abstract method olabilirmi
	// abstract bir method sadece abstract bir class'da olusturulabilir
	public abstract void surekliCalisma();
	// The abstract method surekliCalisma in type IdariPersonel 
	// can only be defined by an abstract class

	@Override
	public void maasHesapla() {
		System.out.println("Idari personel maasi 4000TL");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
