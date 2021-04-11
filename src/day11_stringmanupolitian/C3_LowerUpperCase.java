package day11_stringmanupolitian;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase()  : verilen String'in tamamini kucuk harfe cevirir
		// str.toUpperCase()  : verilen String'in tamamini buyuk harfe cevirir
		
		String str = "Techproeducation";
		
		// buyuk harfle yazdirmak istersek
		System.out.println(str.toUpperCase());
		
		// str'i buyuk harfe cevirmek istersek.
		str=str.toUpperCase();
		
		System.out.println(str); // bu satirdan sonra bkalici olarak BUYUK harflerden olusan bir String olur.
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));	

	}

}
