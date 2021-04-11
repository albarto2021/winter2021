package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		// bir ArrayList nasil olusturulur
		// ArrayLis bir objedir,dolayisi yla yeni bir tane olusturmak icin new keyword kullanmaliyiz
		
		// 1. yol
		ArrayList<String> list = new ArrayList<String>();
		
		// 2. yol
		ArrayList<String> list2 = new ArrayList<>();
		
		// 3. yol En cok cul kullanilir
		List<String> list3 = new ArrayList<>();
		
		// NOT : eger constructor olarak List<>() kullanilirsa CTE verir
		// List<>() constructor olarak kullanilamaz
		
		// List<String> list4 = new List<>();
		
		// Olusturdugumuz Class isimleri Java'da kullanilan obje isimleri ile AYNI OLMAMAMLIDIR
		
		// Liste'e eleman ekleme
		// List olusturulurken otomotik olarak eleman ekleme özelligi yoktur,
		// elemanlarin tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		// List nasil yazdirilir
		
		System.out.println(list3); // [Ali, Veli, Ayse]
		
		list3.add(1, "Can");  // 1. index'e istenen degeri ekler
		System.out.println(list3); // [Ali, Can, Veli, Ayse]
		
		list3.add(1, "Fatma");  
		System.out.println(list3); // [Ali, Fatma, Can, Veli, Ayse]
		
		/*
		 Soru 6) Verilen bir Array'den istenen degere esit olan elemanlari kaldirip,
		 kalanlari yeni bir Array olarak yazadiran bir method yazin		 
		 */		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=3;
		
		List<Integer> istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=sayi) {
				istenenList.add(arr[i]);				
			}			
		}
		System.out.println(istenenList);

	}

}
