package day04;

import java.util.Scanner;

public class C3_Modulus2 {
	public static void main(String[] args) {
		// kulanicidan 4 basamakli bir sayi alalim ve
		// sayinin basamaklarini ters sirada yazdiralim
		
		// bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz.
		// 1. islem en sondaki basamagi elde etmek.
		// 2. islem en sondaki basamagi yok etmek
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamaklari bulmak icin 4 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt(); // bu satirdan ititbaren elimizde 4 basamakli sayi var
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz
		// 1. tekrar
		
		int birlerBas= sayi % 10 ;
		sayi/= 10;
		
		// bu satirdan itibaren sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2. tekrar
		
		int onlarBas = sayi % 10 ;
		sayi/=10;
		
		// bu satirdan itibaren sayimiz 2 basamakli 
		// 3. tekrar
		
		int yuzlerBas= sayi %10;
		sayi/=10;
		
		//// bu satirdan itibaren sayimiz 1 basamakli 
		
		int binlerBas=sayi % 10; // burada % islemi yapmak zorunda degiliz
		
		// tum basamaklar var
		// tum basamaklari yazdiralim
		
		System.out.println("Birler basamagi : " + birlerBas);
		System.out.println("Onlar basamagi : " + onlarBas);
		System.out.println("Yuzler basamagi : " + yuzlerBas);
		System.out.println("Binler basamagi : " + binlerBas);	
		
		// sayiyi tersten yazdiralim
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.print(binlerBas);
		
		System.out.println(); //alt satira gecmek icin bir tane syso bos yazdirilir
		
		// sayinin rakamlari toplamini bulalim
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
				
		//rakamlarin toplamini degil sayilari yanyana yazdirmak istersek
		System.out.println("yazdiginiz sayinin tersten yazilisi : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		scan.close();
	}

}
