package day11_stringmanupolitian;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsilastirir ve String olarak esit olup olmadigina bakar
		// sonuc olarak true veya false döndürür (sonuc)
		
		// bazi metodlarin yaptiklari islem ile döndürdükleri sonuc farkli olabilir.
		// bir methoda git ali isminde ki elementi sil deriz,
		// o da gidip ali'yi bulur siler
		// 
		
		String str = "Ali Can";
		String str2 = "Ali Can";
		
		// str ile str2'nin esit olup olmadigini yazdirin
		// esit veya esit degil yazdirin
		System.out.println(str.equals(str2)); // true
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler case sensetive'dir. (Buyuk kucuk harf duyarlidir.
		// Bir harf bile farkli olsa Stringler esit olmaz		

	}

}
