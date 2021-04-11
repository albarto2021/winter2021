package day12_stringmanupolitian;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini dödürür
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("Char arama " + str.indexOf('g')); // 6
		
		System.out.println("String arama " + str.indexOf("g")); // 6
		
		System.out.println("String kelime arama" + str.indexOf("is")); // i->12  s->13  // 12
		
		System.out.println("birden fazla varsa " + str.indexOf('i')); // ilk buldugu index 12 yi verir
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4)); // bas. index'i inclusive
		
		System.out.println("olmayan harf " + str.indexOf("dert"));
		
		// kullanicidan bir cumlle isteyin
		// case sensetive olmadan Java kelimesi icermedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz: ");
		
		String cumle=scan.nextLine().toLowerCase();
		
		// int sonuc = cumle.indexOf("java"); // java varsa, ilk java kelimesinin index'ini döndürür
											// java yoksa,-1
		
		// System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		if (cumle.indexOf("java")>=0) {  // java kelimesinin index'ini o veya dha buyuk oldugunu kontrol ediyor
			
			System.out.println("Cumle java  iceriyor");
		} else {
			System.out.println("Cumle java icermiyor");
		}	
		scan.close();

	}

}
