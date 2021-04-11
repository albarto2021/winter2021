package day01_variable;

public class C2_Veriables {
	
	public static void main(String[] args) {
		
		int sayi; // ; yazim dilindeki . gibidir. java ;'u gorunce o satýrdaki kod yaziliminin bittiðini anlar.
		sayi=27;
		
		System.out.print(sayi);  // System.out.println(); yazmak için  syso yazýp ctrl+space tuþunu basýnca çýkar
									//eger println deðilde print yazarsak yazdirma iþleminden sonra alt satira geçmez.
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); // println yazinca yazma satýrýndan sonra alt satýra geçer.
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble);
		
		System.out.println(sayi + ilkHarf);// 104 çýkar çünkü M nin ascii deðeri 77. 77+27=104
										//eger bir toplama isleminde char degisken kullanilirsa Ascii degeri ile toplama yapar.
		
		
		
	}

}
