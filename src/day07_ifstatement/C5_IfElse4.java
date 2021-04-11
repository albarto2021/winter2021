package day07_ifstatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarýný alin
		// uc kenar esitse "eskenar" yazdirin
		// yoksa "eskenar degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar");			
		} else {
			System.out.println("Eskenar degil");

		}
		scan.close();

	}

}
