package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {
	
	public static void main(String[] args) {
		// Kullanicidan gun ismini isteyin
		// girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun isimini giriniz");
		
		String gunAdi=scan.next().toLowerCase();
		
		// Eger Stringlerde esitlik sorguluyorsak == kullanmamaliyiz
		// Stinglerde esit olma durumunu sorgulamak icin equals() modulunu kullaniriz
		
		 if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			 System.out.println("haftasonu");
		 }

		 if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") ||
				 gunAdi.equals("carsamba") || gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
			 System.out.println("haftaici");
		 }
		 
		 // gun ismi yanlis yazilmissa olusacak durum yok
		
		scan.close();
	}

}
