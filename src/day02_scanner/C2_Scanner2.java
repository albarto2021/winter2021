package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//kullanicidan dairenin yari �apini isteyin ve dairenin alanini yazin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Alanini hesaplamak i�in Dairenin yari �apini girin");
		
		//kullanicidan yaricap istedim
		//once kullanicinin girdigi yaricap icine koyabilecegim bir degisken olusturmaliyim.
		
		double yaricap= scan.nextDouble();
		
		System.out.println("Dairenin alani= " + 3.14*yaricap*yaricap);	
		
		scan.close();

	}

}
