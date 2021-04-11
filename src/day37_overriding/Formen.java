package day37_overriding;

public class Formen extends Isci{
	public String sorumluOlduguBolum="bakim";
	public String isim="Emrullah";

	public static void main(String[] args) {
		
		// Inheritance'da data turu olarak class ismi kullanimi
		
		// Bir class'da obje uretirlken Data türü olarak class'in kendisini
		// veya parent(lar)rini kullanabiliriz.
		// Olusturdugumuz obje ile variable kullanmamiz gerekirse hangi degeri
		// anlamak icin Data turu olan class'a gideriz
		// orada aradigimiz variable varsa kullaniriz, yoksa
		// paren(lar)'ina bakariz, yukari dogru giderlken ilk buldugumuz degeri kullaniriz.
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class'larin variable'larini gorebiliriz
		fr1.sorumluOlduguBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum + " " + fr1.maas);
		// Emre Marangozhaen 10000
		
		Isci fr2=new Formen();
		// Data turu olarak Isci secildigi icin Formeni goremeyiz ustunu goruruz
		fr2.bolum="Kaynak Atolyesi";
	
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// Mesut Kaynak Atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // Emre

	}

}
