package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6Devam {

	public static void main(String[] args) {
		// Soru 8) Interview Question :: Kullanicidan bir String isteyin ve 
		// String'i tersine ceviren bir program yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz");
		String yazi=scan.nextLine();
		
		// 1. yol variable olusturup en sona yazdiralim
		String tersYazi="";
		
		for (int i = yazi.length()-1; i >= 0; i--) {
			
			tersYazi+=yazi.charAt(i); // tersYazi=tersYazi+yazi.charAt(i)		
		}
		System.out.println("Girdiginiz yazinin tersten yazilisi : " + tersYazi);
		
		// 2. yol tersYazi'yi sadece yazdiracaksak variable olusturmadan da yapabiliriz
		
		System.out.print("Girdiginiz yazinin tersi : ");
		for (int i = yazi.length()-1; i >= 0; i--) {
			System.out.print(yazi.charAt(i));
		}
		System.out.println(""); //print den println ye dönmek iiçin bir tane bos syso yazdirilir
		
		// 3.yol method olusturup bunu yazdirabiliriz
		scan.close();
		
		tersineCevir(yazi);
	}

	public static void tersineCevir(String yazi) {
		System.out.print("Girdiginiz yazinin tersi method ile : ");
		for (int i = yazi.length()-1; i >= 0; i--) {
			System.out.print(yazi.charAt(i));
		}
		
	}

}
