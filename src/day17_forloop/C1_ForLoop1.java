package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		sayi negatif ise veya sýfýrsa "Lütfen pozitif bir tamsayý giriniz" yazdýrýn 
		Girilen sayýnýn rakamlarý toplamýný ayrý bir method'da hesaplayin
		
		Main method içinde kullanýcýdan bir sinir deðer isteyin 
		rakamlar toplamý sinir deðerden büyükse 
		"Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sinir deðerinden büyük",
		deðilse "Girdiðini sayýnýn rakamlar toplamý, girdiðimiz sinir deðer deðerinden büyük deðil"
		yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		if (sayi<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");			
		} else {
			rakamlarToplamiYazdir(sayi);
			
		}	
		scan.close();

	}

	public static void rakamlarToplamiYazdir(int sayi) {
		int rakamlarToplami=0;	
		String sayi2=sayi+""; // sayi1'i String'e cevirdik
		
		for (int i = 1; i < sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		System.out.println("Rakamlar toplami : " + rakamlarToplami);
		
	}

}
