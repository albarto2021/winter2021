package day35_inheritance;

public class Personel {
	public String isim;
	public int sayi;
	
	public Personel() {  // parametresiz cons. olusturduk
		// super();
		
		/* 
		  Java'dan yardim alarak bir cons. olusturdugumuzda, 
		  Java cons. il satirina super(); keyword'unu ekler
		  Eger icinde oldugumuz class bir child class degilse super(); keyword'u silinebilir
		  Bugune kadar biz olusturdugum cons. da hic super(); keyword'u kullanmadik
		      ancak bizim classlarimiz child class olmadigindan sorun olmadi
		 */
		System.out.println("Personel parametresiz constructor calisti");
	}

	public Personel(String isim, int sayi) { // parametreli cons. olusturduk 
		// super();
		
		System.out.println("Personel parametreli constructor calisti");

	}
	
	


	/* Eski derslerden hatirlatma.
	   Her class default constructor'a sahiptir.
	   Default constructor'in parametresi yoktur
	   Biz parametreli veya parametresiz bir constructor olusturdugumuzda default cons. silinir.
	   Eger biz sadece bir tane parametreli cons. olusturursak Java default olani sildigi icin
	   			parametresiz cons. kalmaz. 
	   Dolayisiyla parametreli bir cons. olusturdugumuzda mutlaka default cons. yerine de
	   		parametresiz bir con. olusturmamiz gerekir.
	 
	 */


}
