package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanicidan degerler alarak int degerler olusturun
		// once kullanicidan girecegi sayi adedini almamiz lazim ki array'i olusturalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kac sayidan olusan bir array istediginizi yaziniz");
		int uzunluk=scan.nextInt();
		
		int arr[]= new int[uzunluk];
		
		System.out.println("Lutfen sayilari giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scan.nextInt();			
		}
		
		System.out.println(Arrays.toString(arr));		
	}
}
