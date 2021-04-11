package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// Kullanicidan hangi gunde oldugumuzu isteyin (yaziyla)
		// girilen gunun hafta ici veya hafta sonu oldugunu yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz");
		
		String gun = scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi" :
		case "sali" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Haftaici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Haftasonu");
			break;
		default :
			System.out.println("Lutfen geçerli gun ismi giriniz");		
		}
		scan.close();
	}

}


