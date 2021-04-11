package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	
	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		sayi negatif ise veya s�f�rsa "L�tfen pozitif bir tamsay� giriniz" yazd�r�n 
		Girilen say�n�n rakamlar� toplam�n� ayr� bir method'da hesaplayin
		
		Main method i�inde kullan�c�dan bir sinir de�er isteyin 
		rakamlar toplam� sinir de�erden b�y�kse 
		"Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz sinir de�erinden b�y�k",
		de�ilse "Girdi�ini say�n�n rakamlar toplam�, girdi�imiz sinir de�er de�erinden b�y�k de�il"
		yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		System.out.println("Lutfen sinir deger icin pozitif bir tam sayi giriniz");
		int sinir=scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");			
		} else {
			if(rakamlarToplamiHesapla(sayi)>sinir) {
				System.out.println("Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz sinir de�erinden b�y�k");
			} else {
				System.out.println("Girdi�ini say�n�n rakamlar toplam�, girdi�iniz sinir de�erinden b�y�k de�il");
			}
			
		}
		scan.close();
		
			rakamlarToplamiHesapla(sayi); 
			
		}	
		

	public static int rakamlarToplamiHesapla(int sayi) { // private'i public ile void'i int ile degistirdik
		int rakamlarToplami=0;	
		String sayi2=sayi+""; // sayi1'i String'e cevirdik
		
		for (int i = 1; i < sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		
		return rakamlarToplami;	
		
	}
}
