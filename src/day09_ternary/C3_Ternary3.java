package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// soru1) Kullanicidan iki sayi alin buyuk olani yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen karsilastirmak icin iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi1 : sayi2);
				
		scan.close();

	}

}
