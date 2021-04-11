package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list); // [Ali, Can, Ayse, Fatma]
		
		System.out.println(list.size()); // 4
		
		System.out.println(list.remove(1)); // Can // index'i 1 olan Cani sislip, sildigi elemani bana dondurecek
		System.out.println(list); // [Ali, Ayse, Fatma]
		
		System.out.println(list.remove("Ayse")); // true // Ayse'yi silecek ve bize true dondurecek
		System.out.println(list); // [Ali, Fatma]
		
		System.out.println(list.remove("Mehmet")); // Mehmet'i bulamadigi icin silemeyecek ve bize false dondurecek
		System.out.println(list); // [Ali, Fatma]
		
		list.remove(1);
		list.remove("Ali");
		
		System.out.println(list); // []
	}

}
