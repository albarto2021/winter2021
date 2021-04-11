package day07_ifstatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi isteyin,
		// sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
		// sayilarin ikiside negatif ise sayilarin carpimini yazdirin
		// sayilarin ikisi
		// farkli isaretlere sahipse "farkli isaretli sayilarla islem yapamazsin" yazdirin
		// syailardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0 || sayi2==0) {
			System.out.println("Sifir carpmaya gore yutan elemandir");
			
		} else if(sayi1>0 && sayi2>0){
			System.out.println("Sayilarin toplam : " + (sayi1+sayi2));
			
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("Sayilarin carpimi : " + sayi1*sayi2);
			
		}else {
			System.out.println("farkli isaretli sayilarla islem yapamazsin");	
			
		}
		scan.close();
	}

}
