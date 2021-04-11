package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'e ulasmaya calisalim
		
		Encapsulation02 obj1 = new Encapsulation02();
		Encapsulation02 obj2 = new Encapsulation02();
		
		// Biz erisim yetkisini ikiye ayiriyoruz
		// 1- okuyabilme
		// 2- degistirip kullanabilme
		
		System.out.println(obj1.sayi); // 100 public oldugundan hem okudum
		obj1.sayi=25;				   // 25 hem de deger atayabildim
		System.out.println(obj1.sayi); 	
	
		System.out.println(obj2.sayi); // 100	
		
		System.out.println(obj1.getOkulIsmi()); // get method'u oldugu icin sadece bilgi verir
		// obj1.getOkulIsmi()="Mehmet Koleji"; // get method'u sadece okur, degistirmez
		
		obj1.setTcNo("326547895447");
		// System.out.println(obj1.setTcNo("326547895447")); set() methodu okumaya izin vermez
		
		
		
		// Bir Class içinde class member oluşturuken bunu diğer class'lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa değiştiremesin Private ==> Public get();
		// 3 - İlk atadığım değeri kimse goremesin Private ==> Public set ()
	}
}
