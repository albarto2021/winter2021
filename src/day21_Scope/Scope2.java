package day21_Scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// static variable'lar icin object olusturma ihityaci yoktur
		// Baska bir Class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // Java Run Time program'dir.
										   // Scope2 Class'i calistirildiginda Scope1 calismazzzz
										   // dolayisi ile en basta olusturulan veya atnan degerler gecerli olur.
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);

	}

}
