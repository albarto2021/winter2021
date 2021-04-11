package day39_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeptions02 {

	public static void main(String[] args) {
		/* 
		 	Eger kodumuzu yazdigimizda birden fazla exeptions'la iliskili durum olusuyorsa
		 	Icice try-catch bloklari olusturabiliriz
		 	Bu ornekte ilk once dosyayi okutmak istedik
		 	Java "Ja dosyayi bulamazsam?" diye bizden yardim istedi
		 	Biz de try-catch blogu ile FileNotFoundException ile handle etmesinde yardimci olduk
		 	Sonra dosyada ki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam" 
		 	diye yardim istedi
		 	Biz de try-catch blogu ile IOException ile handle etmesini sagladik
		 */
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\asus\\eclipse-workspace\\winter2021turkish\\src\\day39_Exeptions\\File");
			int k=0;
			try {
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlarini handle eder
				
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		
		System.out.println("........Kod bloke olmamis");


	}

}
