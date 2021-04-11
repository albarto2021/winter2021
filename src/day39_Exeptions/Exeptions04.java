package day39_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeptions04 {

	
		
		/*
		   Eger handle edilecek exeptio'lar arasinda parent-child iliskisi varsa
		   bu durumda child exeptions icin catch blogu yazmasakta kodumuz calisir
		   Child exeptions u slüilmenin
		   pozitif yani: tek catch blogu ile tum exeptions lar handle edilebilir
		   negatif yani: bir sorunla karsilastigimizda bunun dosya bulamadigi icin mi
		   	 			yoksa dosyaokunamadigi icinmi oldugu anlasilmaz
		   
		  
		 */
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\asus\\eclipse-workspace\\winter2021turkish\\src\\day39_Exeptions\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
				}			

		} catch (IOException e) {  

			System.out.println(e.getMessage());
		}
		System.out.println(" ");
		System.out.println("Kod bloke olmamis");

	}

}