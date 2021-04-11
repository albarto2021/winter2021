package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		set1.add("D");
		System.out.println(set1); // [A, B, C, D, F, Y]
		
		System.out.println(set1.hashCode()); // 425
		// Set'de onemli ozellik no dublication ve elemnin kumede var olup olmamamsidir.
		// siralama Set icin onemli degildir
		// Set icin elemanlari girdigimiz sirada verir veya elemanlari natural siralama ile verir
		// gibi cumle KULLANAMYIZ
		
		set1.add("M");
		set1.add("E");
		System.out.println(set1); // [A, B, C, D, E, F, Y, M]
		System.out.println(set1.hashCode()); // 571
		// Collections'da hashCode() method'u o collection icindeki tum
		// elemanlarin hash code'larinin toplamini verir
		// yeni eleman eklersek dogal olarak hash code'da degisir.
	}

}
