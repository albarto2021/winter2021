package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// Kullanicidan bir dikdortgenin iki kenar uzunlugunu alin 
		// kenar uzunluklari esitse "kare"
		// esit degilse "dikdortgen" yazdirin
		
		/*
		 * kendi yaptigim
		Scanner scan= new Scanner(System.in);		
		System.out.println("Lutfen dikdorkenin 1. kenar uzunlugunu girin");
		
		int birinciKenar=scan.nextInt();
		System.out.println(birinciKenar);		
		
		System.out.println("Lutfen dikdorkenin 2. kenar uzunlugunu girin");
		
		int ikinciKenar=scan.nextInt();
		System.out.println(ikinciKenar);
		
		if (birinciKenar*2==ikinciKenar*2) {
			System.out.println("kare");
		}
		
		if (birinciKenar*2!=ikinciKenar*2) {
			System.out.println("dikdortgen");
		}
		*/

		// hocanın yaptigi
		
		
		Scanner scan= new Scanner(System.in);		
		System.out.println("Lutfen dikdorkenin iki kenarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikdortgen");
		}
		
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("Lutfen gecerli uzunluk giriniz");
			
		}
		scan.close();

	}

}
