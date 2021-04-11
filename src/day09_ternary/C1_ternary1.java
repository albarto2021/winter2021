package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		
		
		int sayi=101;
		// ternary islemi bir sonuc dogurdugundan bir variable olusturup ona assign etmeleyiz		
	    String sonuc = (sayi%2==0) ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		
		// ben bir variable'a assign etmek istemezsem
		// syso icine yazabilirim.
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// basina aciklama yazmak istersem
		// ternary operatorunu parantez icine almalayim
		
		System.out.println("islem sonucu : " + (sayi%2==0 ? "cift sayi" : "tek sayi"));

	}

}
