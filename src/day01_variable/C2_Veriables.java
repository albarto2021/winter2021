package day01_variable;

public class C2_Veriables {
	
	public static void main(String[] args) {
		
		int sayi; // ; yazim dilindeki . gibidir. java ;'u gorunce o sat�rdaki kod yaziliminin bitti�ini anlar.
		sayi=27;
		
		System.out.print(sayi);  // System.out.println(); yazmak i�in  syso yaz�p ctrl+space tu�unu bas�nca ��kar
									//eger println de�ilde print yazarsak yazdirma i�leminden sonra alt satira ge�mez.
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); // println yazinca yazma sat�r�ndan sonra alt sat�ra ge�er.
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble);
		
		System.out.println(sayi + ilkHarf);// 104 ��kar ��nk� M nin ascii de�eri 77. 77+27=104
										//eger bir toplama isleminde char degisken kullanilirsa Ascii degeri ile toplama yapar.
		
		
		
	}

}
