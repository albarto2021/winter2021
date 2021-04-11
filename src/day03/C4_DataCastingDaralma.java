package day03;

public class C4_DataCastingDaralma {
	public static void main(String[] args) {
		
		// double deger olusturalim ve bunu int ve sonrada byte' cevirin
		
		double numDouble=131.56;
		// double'dan integer'e gecerken eger sayida ondalikli bolum varsa
		// Java ondalikli bolumu siler (yok eder)
		
		int numInt = (int)numDouble;
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte)numInt;
		// daha dar (narrow) bir data tipine çevirirken eger data tipinin sinirindan buyukse saymaya
		// negatif en kucuk sayidan devam eder, istenen sayiya kadar gelinceye kadar 
		// tekrar tekrar en kucuk sayiya gider.
		
		
		System.out.println("byte degisken degeri : " + numByte);
	}

}
