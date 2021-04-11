package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/* Soru 6) Kullanicidan pozitif bir tamsayi alin ve bu sayiyi tam bolen sayilari 
		ve toplam kac tane olduklarini ekrana yazdirin.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tamsayi girin");
		int sayi=scan.nextInt(); // 100
		int bolen=1;
		int count=0;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++; // boleni bulunca count'u bir artiralim
				System.out.println(bolen);
			}
			bolen++;					
		}
			System.out.println(sayi + " sayisinin bolenleri : " + count + " adettir");
			
			
			
		// Ayný soruda
		// bolenleri asagidaki sekilde yazdirin
		// 1- 1
		// 2- 2
		// 3- 4
		// 4- 5
		// 5- 10
			
			bolen=1;
			count=0;
			
			while (bolen<=sayi) {
				
				if (sayi%bolen==0) {
					count++; // boleni bulunca count'u bir artiralim
					System.out.println(count +"- " + bolen);
				}
				bolen++;					
			}
			scan.close();

	}

}
