package day07_ifstatement;

import java.util.Scanner;

public class C3_ifElse2 {

	public static void main(String[] args) {
		// kullanidan bir karakter girmesini isteyin.
		// harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
			
		if ((karakter >='a' && karakter<='z') || (karakter >='A' && karakter<='Z')) {
			System.out.println("girdiginiz karakter Harf");
			
		} else {
			System.out.println("Girdiginiz karakter Harf Degil");

		} // A z
		scan.close();
		

	}

}
