package day38_Exeptions;

import java.util.Scanner;

public class Exeptions02 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin
		int count=1;
		Scanner scan=new Scanner(System.in);
		
		while(count<=100) {
		
		System.out.println("Lutfen bolunecek tam sayiyi yazin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kaca bolmek istediginizi yazin");
		int sayi2=scan.nextInt();
		/* Java'ya exeptions'i handle etmek icin bir cozum uretmezsek
		   Java exeption ile karsilastiginda calismayi durdurur (stop execution)
		   throws exeption (exeption firlatir) /problemin kaynagini bize gosterir)
		   
		   tum aplication durmus olur...
		   Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZ
		   Bunun icin kod yazan kisi muhtemel sorunlari ongormeli ve
		   Java'ya bu sorunla handle edebilmesi icin yol gostermelidir.		
		*/
		
		System.out.println("islem no : " + count);
		try {
			System.out.println("bolme isleminin sonucu : " + sayi1/sayi2); 
		}catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		count++;		
		}
		scan.close();

	}

}
