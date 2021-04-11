package day07_ifstatement;

import java.util.Scanner;

public class C6_ifElseIf2 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
		// 59'den kucukse "D", 50-60 arasi "C", 60-80 arasi "B", 80'in uzerinde ise "A"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen notunuzu sayi olarak giriniz");
		
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {  // istenmeyen durum
			
			System.out.println("Lutfen gecerli bir not giriniz");	
			
		} else if(not<50){   // notumuz 0 ile 100 arasinda
			System.out.println("Notunuz : D");

		} else if(not<60){ // 50 ile 100 arasindadir
			System.out.println("Notunuz : C");
			
		} else if(not<80) {// 60 ile 100 arasindadir
			System.out.println("Notunuz : B");			
		
		} else {// 80 ile 100 arasindadir
		System.out.println("Notunuz : A");
		}
		scan.close();

	}

}
