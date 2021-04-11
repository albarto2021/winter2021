package day09_ternary;

import java.util.Scanner;

public class C5_Nested_Ternary1 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
		// girilen degerlere gore dikdortgenin kare olup olmadiigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen konrol icin Dikdorgenin kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenar uzunlugu");
		
		scan.close();

	}

}
