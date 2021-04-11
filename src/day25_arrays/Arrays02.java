package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilen bir array de bir elemanin olup olmadigini nasil kontrol ederiz?
		
		int arr[]= {10,25,3,16,75};	
		
		int sayi=25;
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;				
			}
		}
		if (flag) {
			System.out.println("Array sorulan elemani iceriyor");			
		} else {
			System.out.println("Array sorulan elemani icermiyor");
		}
		
		// Arrays class'indan method kullanarak yapalim
		Arrays.sort(arr); // ilk once siralama yapmaliyiz [10,25,3,16,75]
		System.out.println(Arrays.binarySearch(arr, 25)); // sonuc olarak aranan sayinin index'ini verir
		System.out.println(Arrays.binarySearch(arr, 10)); // 1
		System.out.println(Arrays.binarySearch(arr, 28)); // -5
		System.out.println(Arrays.binarySearch(arr, 5)); // -2
		System.out.println(Arrays.binarySearch(arr, 100)); // -6
		
		// binary search sonuc olarak aradigimiz eleman varsa indexini verir
		// aradigimiz eleman yoksa - isareti ile olsaydi kacinci eleman olacagini doner
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2); // [12,15,25,14,3,12,65]
		System.out.println(Arrays.binarySearch(arr2, 14)); // 3
		System.out.println(Arrays.binarySearch(arr2, 20)); // -6
		System.out.println(Arrays.binarySearch(arr2, 12)); // 1
		System.out.println(Arrays.binarySearch(arr2, 2)); // -1
		
		// Array nasil String'e cevrilir
		
		String arrayString = Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5)); // bastaki [ dahil tum array'i String'e cevirir
	}

}
