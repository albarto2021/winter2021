package day44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
	
	public static void main(String[] args) {		
		List <String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);  // [A, B, C, D]
		
		// Her elemana B harfini ekleyelim
		
		for (String each : list) {
			each+="B";
			System.out.print(each + " ");
		}
		System.out.println(" ");
		System.out.println(list);
		
		// Collections'da her yapi index'i desteklemez. Ornegin Set'de index olmaz
		// Index olmayinca mecburen tum elemanlar ulasmak icin for-each loop kullanilir
		// For-each loop ile de update veya delete yapamayiz
		// Bunun icin Java Iterator Interface'ini olusturmustur....
		
		Iterator it1= list.iterator();
		// next(), has next(), ve remove methodlarina sahiptir.
		// listedeki tum elemanlari iterator kullanarak silelim
		
		while (it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
	}

}
