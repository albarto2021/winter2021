package day07_ifstatement;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// kullanican dikdörtgenin kenar uzunluklarini alin
		// Uzunluklari eþit ise Kare, degilse Kare degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgnin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");			
		} else {
			System.out.println("Kare Degil");
		}
		scan.close();
		

	}

}
