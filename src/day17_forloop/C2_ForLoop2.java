package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	
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
		System.out.println("Lutfen sinir deger icin pozitif bir tam sayi giriniz");
		int sinir=scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");			
		} else {
			if(rakamlarToplamiHesapla(sayi)>sinir) {
				System.out.println("Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sinir deðerinden büyük");
			} else {
				System.out.println("Girdiðini sayýnýn rakamlar toplamý, girdiðiniz sinir deðerinden büyük deðil");
			}
			
		}
		scan.close();
		
			rakamlarToplamiHesapla(sayi); 
			
		}	
		

	public static int rakamlarToplamiHesapla(int sayi) { // private'i public ile void'i int ile degistirdik
		int rakamlarToplami=0;	
		String sayi2=sayi+""; // sayi1'i String'e cevirdik
		
		for (int i = 1; i < sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		
		return rakamlarToplami;	
		
	}
}
