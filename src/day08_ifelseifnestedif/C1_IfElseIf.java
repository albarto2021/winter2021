package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		/*
		 * Kullanicidan gun ismi isteyin.
		 * Girilen isim gecerli bir gun ise gun
		 * isminin 1., 2., ve 3., harflerini ilk harf buyuk diger ikisi kucuk olarak yazdýrýn.
		 * gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		
		String gunIsmi=scan.nextLine(); //girilen tüm harfleri kucuk harfe cevirir.
		// next() sadce ilk kelimeyi alir (ilk space e kadar olan kismi alir)
		// nextLine() : tum satiri alir
		
		if (gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if(gunIsmi.equalsIgnoreCase("Sali")){
			System.out.println("Sal");
		} else if(gunIsmi.equalsIgnoreCase("carsamba")){
			System.out.println("car");
		} else if(gunIsmi.equalsIgnoreCase("persembe")){
			System.out.println("per");			
		} else if(gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");		
		} else {
			System.out.println("Gecerli gun ismi giriniz");
		}
		//  .equalsIgnoreCase() : methodu iki String'in buyuk, kucuk harf hassasiyeti olmadan
		// esit olup olmadigini kontrol eder.
		
		scan.close();

	}

}
