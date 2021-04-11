package day03;

public class C5_ArtimaAzaltma {
	public static void main(String[] args) {
		
		int num = 15;
		
		//bir sayiyi 2 artirmak istersek sayiyi 2 ile toplariz
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num= num+5; // esitligin solunda num yazdigimizda esitligin saginda ki islemd olusan sonuc num
					// variable'ine atanir. bu satirdan SONRA  num=20 dir
		
		System.out.println("16. satirdan sonra num = " + num);
		
		System.out.println(num+12); // 32
		
		// bir sayiyi artirmak (increment) istersek o sayiya istediğimiz sayiyi ekler ve sonucu 
		// variable'a atariz.
		
		// num'i 8 artirin
		
		num = num+8; // num=28
		
		// num'i 5 artirin
		
		num += 5; // num=33 ::: Java pratik olarak artirir num = num+5; yazmaya gerek yok.
		
		System.out.println("Javanin pratik artirisinden sonra num= " + num);
		
		// num'i 10 artirin
		
		num +=10; // num = 43
		
		// num'i 1 artirin
		
		// num = num +1 ;
		num+=1; // num=44
		
		// sadece 1 artşirmaya ozel olarak Java pratik method
		
		num++; // num=45
		
		System.out.println("num'in son hali :" + num);		
	
	}

}
