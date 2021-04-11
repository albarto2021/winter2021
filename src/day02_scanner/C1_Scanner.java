package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		
		//Scanner : kullanýcýdan bilgi alabiliriz. 
		//3 adýmla Scanner isimleri gerçekleþir.
		
		// 1. adim Scanner object oluþturacaðýz
		
		Scanner scan = new Scanner(System.in);
		
		// new: Java da ne zaman new kelimesini görseniz yeni bir object oluþturuluyor demektir.
		// parantezin içine yazýlan degerlere parametre denir. ve Scanner için System.in yazmasi gerekir.
		// bir kod yazdiðimizda kodun altýnda kýrmýzý çizgi oluþuyorsa 
		// veya satýr numarasý olan kýsýmda kýrmýzý X birþeyler yanlýþ.
		// kýrmýzý çizgi ile çizili kodun üstüne mousela gidildiðinde çýkan pencerede import 'Scanner' (Java.util) kütüphaneye gider.
		// Java.util Java'nýn bizim için hazýrladiði bir kütüphanedir, ihtiyacýðýmýz olduðunda ihtiyacýmýz olan kodlari class'a import etmemiz yeterlidir.
		// scan oluþturduðumuz Scanner objesine verdiðimiz isimdir. farkli isimlerde verebiliriz ancak scan ismi tüm programcýlar
		// tarafýndan kullanýlan bir iþlemdir ve rahat rahat okunabilir olmasý için scan ismi kullanmamiz tavsiye edilir.
		
		// 2. adim kullaniciya bir mesaj yazýn
		System.out.println("Karenin bir kenar uzunluðunu girin");
		
		// 3. adim kullanýcýn konsola girdiði deðeri programýmýza alacaðýz.
		// ve bir veriable oluþturup bu deðeri atayacaðýz.
		// kullanýdan bir kenar uzunluðu istediðim için kullanýcý küçük sayida girer büyük sayida girer
		// tam sayida olabir virgüllü sayýda yazabilir. 		
				
		double kenar=scan.nextDouble();
		
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);

		scan.close();
	}

}
