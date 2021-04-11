package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concanition (Birlestirme) : Java'da birden fazla String'i + isareti ile 
		// toplarsaniz, Java bu String leri yanyana yazar.
		
		String str1="Java";
		String str2="Guzeldir";
		
		System.out.println(str1+str2); // JavaGuzeldir
		// eger arada bosluk birakmak istersek
		System.out.println(str1+" "+str2);  // Java Guzeldir ::: dogrusu bu
		
		System.out.println(str1+' '+str2);
		
		// GuzeldirJava
		System.out.println(str2+str1);
		
		int sayi1= 5;
		int sayi2= 4;
		// verilen degiskenleri kullanarak consola 9 yazdirin
		
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1 + sayi2 + str1 + str2); // JavaGuzeldir
		
		System.out.println(str1 + str2 + sayi1 + sayi2); // JavaGuzeldir54
		
		// verilen degiskenlerle JavaGuzeldir1 yazdirin
		
		System.out.println(str1 + str2 + (sayi1 - sayi2)); // JavaGuzeldir1
		
		// verilen degiskenlerle 9 JavaGuzeldir yazdirin
		System.out.println(sayi1 + sayi2 + ' ' + str1 + str2); // 41JavaGuzeldir
		
		// Java matematiksel bir islem yaparken char data turunden bir degerle 
		// karsilasirsa o char'in ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2); // 9Java Guzeldir
		
		System.out.println(str1+str2+sayi1*sayi2); // JavaGuzeldir20
		
		// son tekrar
		/* kural1) Eger toplanan degerlerden bir tanesi bile String ise Java toplama degil
		 * 			Concatenation (Birlestirme) yapar
		 * Kural2) Eger toplanan degerlerin ikisi de matmatiksel islemse Java toplar
		 * Kural3) Eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler
		 * 			belirlenip o islemler icin parantez kullanilabilir
		 * Kural4) Matmatiksel bir islemde char degisken kullanirsa, Java cahr'in ascii degerini 
		 * 			isleme alir
		 * Kural5) cahr bir degisken ile String bir degisken toplanirsa concatenation olur
		 * 
		 * */

	}

}
