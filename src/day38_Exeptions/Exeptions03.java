package day38_Exeptions;

import javax.naming.PartialResultException;

public class Exeptions03 {

	public static void main(String[] args) {
		// try catch block'undaki e nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exeptions01 exp=new Exeptions01();
		// esitligin solundaki Exeptions01 hem class adi hemde exp objesi icin data turu
		
		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) { // int sayi, String str, Object obj gibi
		// ArithmeticException Java'da bir class ve e objesi icin data turu
		// e ise ArithmeticException class'inden olusturdugumuz objenin adi
			System.out.println("sayiyi sifira bolemezsin"); // bizim kullaniciya vermek þstedigimiz mesaj
		// o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		// bu durumda hem java'ya sorunu yazmasi icin firsat vermis
		// hem de aplication'u bloke etmemis oluruz.
			System.out.println(e.getMessage()); // / by zero
			
			e.printStackTrace();
			/* 
			 java.lang.ArithmeticException: / by zero
						at day38_Exeptions.Exeptions03.main(Exeptions03.java:17)
		    */


		}
		
		System.out.println("Kod bloke olmamisss ");

	}

}
