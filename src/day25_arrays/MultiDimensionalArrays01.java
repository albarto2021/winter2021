package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/* 1- Ic ice array olusturdugumuzda disardaki ana array'e outer array
		      icerdeki kucuk array'lere ise inner array denir.
		   2- Eger icerdeki array'lerin boyutlari birbirinden farkli ise 
		      Array'i ancak tum elemanlari yazarak declare ederiz.
		   3- Multi dimensional array'de bir eleman index'i icin
		   	  en disdaki array haric, elemana kadar olan tum arraylerin
		   	  indexlerini yazmak gerekir
		 */
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}}; // iki katlibir array'dir.
		
		// 11'i index ile ifa etmek istersek arr[2][2]
		
		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2];
		// [3] iki yazilan sayi outer array'in icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array'in uzunlugu 
		
		System.out.println(Arrays.toString(arr2));
		
		// Multi dimensiomal array'ieri yazdirmak icin toString method'u kullanilamaz.
		// Cunku toString methodu outer array'i String'e cevirir
		// outer array'in icinde inner array'ler oldugundan toString method'unda inner array'ler 
		// referans degerleri yazdirir
		System.out.println(Arrays.deepToString(arr2));		
	}
}
