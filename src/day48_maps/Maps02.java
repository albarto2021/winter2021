package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Asagida verilen map'te yazilim dili Java olan kisi isimlerini bir liste olarak donduren
		// bir method yazin
		
		Map<Integer,String> map1 = new HashMap<>();
		
		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		String istenenDil="JAVA";
		
		List<String> isimList = javaBilenler(map1,istenenDil);
		System.out.println(isimList); // [Ali, Veli]		

	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		
		// System.out.println(map1.entrySet()); // [101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#]
											 // set oldugu icin koseli parantez oldu
		
		List<String> isimListesi= new ArrayList<>();
		
		
		for (String each : map1.values()) {
			
			String arr[]= each.split(", "); // split methodu 1. elemani array'a donduruyor, yani ,_ a donduruyor
											// kelimeleri tek tek alir
			
			if(arr[2].equalsIgnoreCase(istenenDil) ) {
				isimListesi.add(arr[0]);
			}

		
		}
		
		
		
		return isimListesi;
	}

	
}
