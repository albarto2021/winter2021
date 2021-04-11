package day03;

import java.util.Scanner;

public class C2_Scanner2 {
	public static void main(String[] args) {
		
		// Kullanicidan ismini isteyip ilk harfini buyuk harf olarak yazdirin
		// mehmet ==> basharfiniz : M
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		// String de harflerin indexleri 0 dan baþlar
		// biz ilk harf almak istediigimiz için index olarak 0 girmeliyiz.
		
		System.out.println("bas harfiniz : " + ilkHarf);
		
		// eger charAt(0) yazdiktan sonra . koyarsak metodlar gelmez
		// cunku CharAt(0) methodu kullanilinca variable imizi char yapmis oluruz.
		// char primitive data tipindedir.  ve 
		// primitive data tipleri method lara sahip degildir.
		
		scan.close();
		
	}

}
