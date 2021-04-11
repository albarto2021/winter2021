package day39_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeptions03 {

	public static void main(String[] args) {
		
		/* Icice try-catch yerine 
		   bir tane try ve multiple catch blogu kullanabiliriz
		   Ancak bu durumda yazdigimiz exeptionslar arasinda Parent-Child iliskisi varsa
		   once child class'i yazmaliyiz
		   Aksi takdirde (yai once parent yazilirsa) child'a is kalmaz
		   Java erisilmez catch- blogu diyerek CTE verir
		 */

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\asus\\eclipse-workspace\\winter2021turkish\\src\\day39_Exeptions\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
				}
			} catch (FileNotFoundException e) { // once child exeption'i yazdik

				e.printStackTrace();
			

		} catch (IOException e) { // sonra parents exeptions'u 

			System.out.println(e.getMessage());
		}

		System.out.println("........Kod bloke olmamis");

	}

}
