package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini alarak aralarinda boþluk birakarak yazin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		
		String name=scan.nextLine(); // sadece next seçilirse birden fazla kelime girerse ilk kelimeyi girer.
								// eger kullanicinin girdigi tüm yaziyi almak için nextLine() seçmeliyiz.
				
		System.out.println("lütfen soyisminizi giriniz");
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);
		
		scan.close();

	}

}
