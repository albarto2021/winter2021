package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir tamsayi alin
		// 1'den kullanic�n�n girdigi sayiya kadar olan sayilarin 
		// toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		for (int i = 1; i <=sayi; i++) {
			
			// toplam=toplam+i;
			toplam+=i;			
		}
		System.out.println(toplam);
		
		scan.close();

	}

}
