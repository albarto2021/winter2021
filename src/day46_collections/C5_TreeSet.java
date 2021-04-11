package day46_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C5_TreeSet {

	public static void main(String[] args) {

		Set<String> set1 = new TreeSet<>(); // siralama herseyden onemli ise TreeSet kullanmamiz lazim

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			set1.add("" + i);
		}

		System.out.println(System.currentTimeMillis());

		System.out.println("=================");

		Set<String> set2 = new HashSet<>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			set2.add("" + i);
		}
		Set<String> set3 = new TreeSet<>(set2);
		System.out.println(System.currentTimeMillis());
	}
}
