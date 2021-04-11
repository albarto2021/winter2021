package day21_Scope;

public class Scope1 {
	
	static int okulId=1201;
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi;
	
	// static variable'ler class level'de olusturuldugu icin class'in her yerinden kullanilabilirler.
	// instance variable'ler static olmayan method'larda direk kullaniliyorken, static method'larda
	// object olusturularak kullanilabiliyordu.
	// static variabþe'lar ise ister static isterse static olmayan tum method'lardan direk kullanilabilir
	

	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1201 Yildiz Koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod();
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //  1203 Yildiz Koleji true

	}
	
	public static void staticMethod() {		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1202 Yildiz Koleji true
		okulId=1203;
		
	}
	
	public void method() {
		okulId=1205;
		
	}

}
