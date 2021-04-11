package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*
		 Soru 4) Kullanicidan baslangic ve bitis harflerini alin ve
		 baslangic harfinden baslayip bitis harfinde biten tüm harfleri
		 buyuk harf olarak ekrana yazdirin.
		 Kullanicinin hata yapmadigini farz edin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic ve bitis harfini girin"); 	
		char basHarf=scan.next().toUpperCase().charAt(0); // C
		
		System.out.println("Lutfen baslangic ve bitis harfini girin");		
		char bitHarf=scan.next().toUpperCase().charAt(0); // F
		
		for (char i = basHarf; i <= bitHarf; i++) {
			System.out.print(i + " ");			
		}
		System.out.println("");
		
		// while loop ile yapalim
		// baslangic degeri var basHarf
		
		while (basHarf<=bitHarf) {
			System.out.print(basHarf + " ");
			basHarf++;			
		}
		scan.close();
	}

}
