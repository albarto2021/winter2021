package day07_ifstatement;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		// kullanýciya yasini sorun
		// 65 den buyukse "emekli olabirisin" yoksa "emekli olamazsin" yazin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
				
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");			
		} else {
			System.out.println("Emekli olamazsiniz");

		}
		scan.close();
		

	}

}
