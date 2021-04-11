package day39_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

public class Exeptions01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledginizde
		// Java "Ya dosyayi bulmazsam" der ve cozum uretmenizi bekler
		// dosya bulma ile ilgili exeptions turu: FileNotFoundException
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exeptions'lara Checked Exeptions diyoruz
		// 
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\asus\\eclipse-workspace\\winter2021turkish\\src\\day39_Exeptions\\File");
		} catch (FileNotFoundException e) {
			
			// e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); // daha az hata aciklamasi yazdirir
		}
		
		System.out.println("Kod bloke olmamis");

	}

}
