package day21_Scope;

public class Scope6 {
	public int num1; // access modifier public yapilinca her yerden ulasilabilir
	String name= "Ali"; // access modifier yazilmadigi icin default access modifier gecerlidir
						// saedece paket icinde kullanilabilir
	public static void main(String[] args) {
		add();
		// product (5); static olmayan bir method static olan main method icerisinden cagrýlmaz
	}
	public static  void add() {
		// num1 ++; // static olmayan (instance) num1, static bir method icinden kullanilamaz
		int num2 =6;
		char letter;
		System.out.println("Do addition ");
	}
	public void product(int num3) {
		name = "Veli";
		// num2++; // num2 ustteki method'da olusturulmus local bir variable'dir. 
		System.out.println(num3*num3);
	}

}
