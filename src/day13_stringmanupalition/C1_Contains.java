package day13_stringmanupalition;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir string isteyin 
		// cumle String'i iceriyorsa "basarili" , degilse "basarisiz" yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lutfen bir cumle giriniz: ");			
		String cumle=scan.nextLine().toLowerCase();
				
		System.out.println("Lutfen aramak istediginiz kelimeyi giriniz");
		String aranan = scan.nextLine().toLowerCase();
		
		// bu islemin sonucu boolean, benim bunu yaziya cevirmem lazim
		
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");
		
		
		// kullanicidan mail adresi isteyin. Mail adresi @gmail.com iceriyorsa 
		// "mailiniz kaydedildi", yoksa "lutefn gmail adresinizi giriniz" yazdirin
		
		System.out.println("Lutfen mail adresinizi giriniz");
		String email=scan.next();
		
		// eger @gmail.com'un en sonda oldugunu kontrol etmek icin	
		
		int sondami = email.indexOf("@gmail.com" , email.length()-10); // index olarak length() -10 yazarsak
			// eger email gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
			// eger email. gamil.com ile bitmiyorsa -1
		
		if (email.contains("@gmail.com") && sondami !=-1) {
			System.out.println("Mailiniz kaydedildi");
		} else {
			System.out.println("Lutfen gecerli gmail adresinizi giriniz");
		}
		
		scan.close();
	}

}
