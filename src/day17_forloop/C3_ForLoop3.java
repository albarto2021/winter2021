package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanicidan 35'dan kucuk bir sayi alin
		// girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun
		// Faktoriyel:: 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen faktoriyel hesaplamak icin 35'den kucuk pozitif bir tam  sayi girin");
		int sayi=scan.nextInt();
		
		if (sayi<=0 || sayi>=35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");			
		} else {
			faktoriyelBul(sayi);

		}		
		scan.close();
		
	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel=1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
	}

}
