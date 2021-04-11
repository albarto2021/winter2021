package day12_stringmanupolitian;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin
		// ve asagidaki 3 durumdan uygun olani yazdirin
		// 1- cumle java icermiyor
		// 2- cumle 1 tane java iceriyor
		// 3- cumlede birden fazla java var
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz: ");
		
		String cumle=scan.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		
		if (ilkJava==-1) {			
			System.out.println("Cumle java icermiyor");
			
		} else if(ilkJava==sonJava) {
			System.out.println("cumle 1 tane java iceriyor");
			
		} else {
			System.out.println("cumlede birden fazla java var");
		}		
		scan.close();

	}

}
