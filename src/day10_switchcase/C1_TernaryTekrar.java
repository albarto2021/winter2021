package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve
		// sayi uc basamakli ise "uc basamakli sayi" yoksa
		// "uc basamakli degil" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc basamakli sayi girin");
		
		int sayi=scan.nextInt();
		
		String sonuc = sayi>99 ? (sayi<1000 ? "uc basamakli" : "uc basamkli degil") : "uc basamkli degil";
		
		System.out.println(sonuc);
		
		// nested ternary olmasin
		
		String sonuc2 =sayi>99 && sayi<1000 || sayi>99 && sayi<1000 ? "uc basamakli" : "uc basamkli degil";
		System.out.println(sonuc2);
		scan.close();

	}

}
