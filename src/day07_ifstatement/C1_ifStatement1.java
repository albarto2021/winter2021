package day07_ifstatement;

import java.util.Scanner;

public class C1_ifStatement1 {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi isteyin 
		// sayi pozitif ise "sayi pozitif" yazdirin
		// sayi 100'den  kucukse "kucuk sayi" yazdirin
		// sayi 1000'den  buyukse "buyuk sayi" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
		
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("sayi pozitif");
		}
		
		if (sayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");
		}
		
		scan.close();

	}

}
