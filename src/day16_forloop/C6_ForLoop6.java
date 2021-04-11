package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Soru 8) Interview Question :: Kullanicidan bir String isteyin ve 
		// String'i tersine ceviren bir program yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime girin");
		
		String kelime=scan.nextLine();
						
			
		for (int i = kelime.length()-1; i >= 0; i--) {
			System.out.print("Girdiginiz yazinin tersten yazilisi : " + kelime.charAt(i));			
		}
		scan.close();

	}

}
