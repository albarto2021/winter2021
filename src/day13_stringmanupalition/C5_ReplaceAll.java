package day13_stringmanupalition;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		
		String str = "Java ogren, mutlu ol, Java candir 12345";
		
		System.out.println(str.replace ("Java" , "hava"));
		
		// replaceAll() method'u replace() methoduna benzer ama 2 farki var
		// 1- replace() method'u char kabul eder ama replaceAll() kabul etmez
		// 2- replaceAll() method'u regex kullanimina izin verir
		
		System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*")); // w'nun tersi
		System.out.println(str.replaceAll("\\d", ".")); // sayþilari . yapar
		System.out.println(str.replaceAll("\\D", ".")); // sayþi  olmayanlari . yapar
		System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
		System.out.println(str.replaceAll("\\S", "&")); // bosluk olmayan herseyi & yapar
		System.out.println(str.replaceAll("\\d", "")); // sayþilari siler
	}

}
