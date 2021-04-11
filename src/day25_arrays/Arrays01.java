package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Array (Dizi):  Java'da birden fazla variable store etmek icin kullanilan objelerden biridir.
		// Array olustururken 2 sayi declare temeliyiz:   1- data type (Bir array'in icerisinde 
		// sadece ayni data tipinden elemanlar olabilir.) 2- uzunluk (uzunluk array'in icerisine konulacak 
		// max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir) 
		
		int arr[]= {10,23,54}; // length =3
		String isimler[]= new String[4]; // length=4 olan bos bir array olusturur
		
		// Array'de primitive datalar veya non-primitive datalarin referanslarini store edebiliriz.
		// Mesela isimlerin arra'inin icinde isim degerleri degil, isimlerin referanslari olur.
		
		// array'in elemanlari ulasma ve update etme
		
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]= "Elveda";
		
		// Array'in tum elemanlarini yazdirma
		System.out.println(isimler); // referansi yazdirir
		System.out.println(Arrays.toString(isimler)); // [Elveda, null, Boss, null]
		
		// method kullanmadan tum elemanlari yazdirma
		// loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.print(isimler[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(arr); // [I@23fc625e yani referans
		System.out.println(Arrays.toString(arr)); // [10, 23, 54]
		
		// Array'in elemanlarini nasil sirayabiliriz.
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	}

}
