package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeption02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\asus\\eclipse-workspace\\winter2021turkish\\src\\day39_Exeptions\\File");
		
		// try-catch blogu exeption ile handle etmekte kullanilir
		// throws keyword'u ise sadece declaration, dolayisiyla
		// throew kullanilan bir method'da exeption olusursa KOD BLOKE OLUR
		int k = 0;
		
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		
		// Eger birden fazla exeption icin throw keyword'u kullanacaksak
		// yazacagimiz exeptionlarin arasindaki iliski ve siralama onemli olur
		// Eger yazdigimiz exeption'lar arasinda parent-child iliskisi varsa once
		// child exeption yazilmalidir, aksi taktirde child exc. erisilmez olur
		
		// Eger yazacakalrimiz arasinda parent-child iliskisi varsa
		// istresek sadece parent'i yazmamiz da yeterlidir
		

	}

}
