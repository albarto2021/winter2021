package day15_methodcreation;

public class C4_FooLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		// bunun yerine loop kullaniyoruz
		// ne yapacagimizi java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		// Tum loop'larda 3 seyi yapmak zorundayiz
		// 1) baslangiz degeri (kactan baslayacak)
		// 2) bitis degeri (kaca kadar gidecek)
		// 3) artis degeri (kacar kacar sayacagiz)
		
		
		for (int i=100 ; i>3 ; i--) {
			
			System.out.println(i + "Hello World");
		}

		
		// Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
		// Not : loop'da artis degeri pozitif oldugu gibi negatifte olabilir i--
		// Not : Artis degeri 1 olmak zorunda degil, farklida olabilir
		// Not : Eger loop'un sarti hic true olmazsa loop body devreye girmez

	}

}
