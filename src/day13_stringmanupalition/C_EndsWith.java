package day13_stringmanupalition;

import java.util.Scanner;

public class C_EndsWith {

	public static void main(String[] args) {
		// 
		
		String str= "Java'la hayat ne guzel";
		
		System.out.println(str.endsWith("zel")); // true
		
		System.out.println(str.endsWith("ne guzel")); // true
		
		System.out.println(str.endsWith("zel ")); // false
		
		// kullanicidan bir mail isteyin 
		// eger @ isareti icermiyorsa " girdiginiz bilgi mail degil"
		// eger @isareti iceriyor ama @gmail.com icermiyorsa "Lutfen mail adresi yazýn"
		// eger ilk iki sartý sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz: ");
		
		String email=scan.next();		
			
		if (!email.contains("@")) { // basinda ! olunca -> email @ icermiyorsa
			System.out.println("Girdiginiz bilgi mail degil");
			
		} else if(!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresi yazýn");
		} else if(email.endsWith("@gmail.com")){
			System.out.println("Emailiniz basari ile kaydedildi");
		} else {			
			System.out.println("Gecersiz gmail adresi");
		}
		scan.close();
		
	}

}
