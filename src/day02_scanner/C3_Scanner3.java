package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini alarak aralarinda bo�luk birakarak yazin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		
		String name=scan.nextLine(); // sadece next se�ilirse birden fazla kelime girerse ilk kelimeyi girer.
								// eger kullanicinin girdigi t�m yaziyi almak i�in nextLine() se�meliyiz.
				
		System.out.println("l�tfen soyisminizi giriniz");
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);
		
		scan.close();

	}

}
