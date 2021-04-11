package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		
		// Bir Class icerisinde olusturulan variable'larin nerede gecerli oldugu
		// ve nereden kullanilabilcegini o variable'in Scope'u belirler.
		// google Java'da Scope nedir?
		
		
		
		int sayi=10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);
		System.out.println();
		

	}

	private static void denemeMethod() {
		//sayi=20;
		String isim="Mehmet";
		
	}

}
