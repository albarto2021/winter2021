package day38_Exeptions;

import java.util.Scanner;

public class Exeptions01 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolunecek tam sayiyi yazin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kaca bolmek istediginizi yazin");
		int sayi2=scan.nextInt();
		// Java exeptions'i handly etmek icin try-catch blogu olusturmustur
		
		try {
			System.out.println("bolme isleminin sonucu : " + sayi1/sayi2); // 0 a bölen olmadiginda hata verir	
		
		}catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		
		
		// 3 hata --- kendi notum ---
		// java.lang.ArithmeticException: aritmetic problem :::
		// -- / by zero-- bundan dolayi
		// Exeptions01.java:16) hatanin yeri

		
		
		
		
	}

}
