package day07_ifstatement;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		/* Kullanicidan maas icin bir teklif isteyin ve 
		 * asagidaki degerlere gore cevaap yazin
		 * Teklis 80.000  in uzerinde ise "kabul ediyorum"
		 * 60 - 80.000 arasinda ise "konusabiliriz"
		 * 60.000'nin altinda ise "Maalesef kabul edemem" yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen maas teklifinizi giriniz");
		
		double maas=scan.nextDouble();
		
		if (maas>=80000) {
			System.out.println("kabul ediyorum");
			
		} else if(maas>=60000 && maas<=80000){
			System.out.println("konusabiliriz");
		} else {
			System.out.println("Maalesef kabul edemem");
		}
		scan.close();

	}

}
