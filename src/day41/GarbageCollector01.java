package day41;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		String str=" ";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		
		// bu kod calistiginda kac tane obje olusur?
		// 1001
		// ilk basta 1 tane olustýrdýk
		// sonra her dongude str'a concatination yapilacak
		// ama String Class'i immutable oldugu icin her yeni degeri koymak icin
		// yeni bir  String objesi olusturuþlur ve eski obje'den silinir
		
		// dolayisiyla loop bittiginde str icin birtane pointer'in isaret ettigi obje,
		// 1000 tane de hic bir pointer'in isaret etmedigi obje heap memory de bulunur
		
		List<Integer> list= new ArrayList<>();
		// bu satir Java'ya yeni bir obje olusturmasini istiyor.
		// Java yeni obje icin yer varmi diye memory'yi kontrol eder ve memory krtik seviyede ise 
		// Garbage collector'u devreye sokuyor...
		
		// Garbage collector finalize(); method'unu calistirir.
		// finalize method'u silinecek objeleri isaretler ve 
		// sonra Garbage collector finalize olan objeleri siler.
		
		
	}

}
