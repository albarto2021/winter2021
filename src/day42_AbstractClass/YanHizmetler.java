package day42_AbstractClass;

public abstract class YanHizmetler extends Personel{
	
	// abstract bir class'in abstract child'ini olusturursak 
	// abstract methodlari implament etmek zorunda olmayiz
	// cunku Java bilir ki bu child concrete degilm, mutlaka bu child'in 
	// concrete child class'i olacak.
	
	public static void main(String[] args) {
		
		// YanHizmetler obj1 = new YanHizmetler();
		// abstract bir class'tan obje uretilemez 
		// Cannot instantiate the type YanHizmetler
		
	}

}
