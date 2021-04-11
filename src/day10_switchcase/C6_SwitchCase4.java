package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// Kullanicidan VIP (Very Important Person) kisalmasinda hangi harfin anlamini istedigini soralim
		// girilen harfin aciklamasini yapalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen VIP harflerinden birini giriniz");
		
		char harf = scan.next().charAt(0);
		
		switch (harf) {
		case 'v' :
		case 'V' :
			System.out.println("Very");
			break;
		case 'i' :
		case 'I' :
			System.out.println("Important");
			break;
		case 'p' :
		case 'P' :
			System.out.println("Person");
			break;
		default :
			System.out.println("Lutfen geçerli harf giriniz");		
		}
		
		// Kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
		// ve bunu hata olarak kullaniciya hata olarak vermek istiyorsaniz
		
		System.out.println("Lutfen VIP harflerinden birini giriniz");
		
		String str = scan.next();
		
		switch (str) {
		case "v" :
		case "V" :
			System.out.println("Very");
			break;
		case "i" :
		case "I" :
			System.out.println("Important");
			break;
		case "p" :
		case "P" :
			System.out.println("Person");
			break;
		default :
			System.out.println("Lutfen geçerli harf giriniz");		
		}
		
		scan.close();
	}

}

