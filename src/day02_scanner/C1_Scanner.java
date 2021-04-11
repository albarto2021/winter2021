package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		
		//Scanner : kullan�c�dan bilgi alabiliriz. 
		//3 ad�mla Scanner isimleri ger�ekle�ir.
		
		// 1. adim Scanner object olu�turaca��z
		
		Scanner scan = new Scanner(System.in);
		
		// new: Java da ne zaman new kelimesini g�rseniz yeni bir object olu�turuluyor demektir.
		// parantezin i�ine yaz�lan degerlere parametre denir. ve Scanner i�in System.in yazmasi gerekir.
		// bir kod yazdi�imizda kodun alt�nda k�rm�z� �izgi olu�uyorsa 
		// veya sat�r numaras� olan k�s�mda k�rm�z� X bir�eyler yanl��.
		// k�rm�z� �izgi ile �izili kodun �st�ne mousela gidildi�inde ��kan pencerede import 'Scanner' (Java.util) k�t�phaneye gider.
		// Java.util Java'n�n bizim i�in haz�rladi�i bir k�t�phanedir, ihtiyac���m�z oldu�unda ihtiyac�m�z olan kodlari class'a import etmemiz yeterlidir.
		// scan olu�turdu�umuz Scanner objesine verdi�imiz isimdir. farkli isimlerde verebiliriz ancak scan ismi t�m programc�lar
		// taraf�ndan kullan�lan bir i�lemdir ve rahat rahat okunabilir olmas� i�in scan ismi kullanmamiz tavsiye edilir.
		
		// 2. adim kullaniciya bir mesaj yaz�n
		System.out.println("Karenin bir kenar uzunlu�unu girin");
		
		// 3. adim kullan�c�n konsola girdi�i de�eri program�m�za alaca��z.
		// ve bir veriable olu�turup bu de�eri atayaca��z.
		// kullan�dan bir kenar uzunlu�u istedi�im i�in kullan�c� k���k sayida girer b�y�k sayida girer
		// tam sayida olabir virg�ll� say�da yazabilir. 		
				
		double kenar=scan.nextDouble();
		
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);

		scan.close();
	}

}
