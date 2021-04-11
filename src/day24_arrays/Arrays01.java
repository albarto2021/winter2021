package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
		
		
		// Java'da birden fazla elemani koyabilecegimiz (store) object'ler vardir.
		// Bugun bunlardan ilkini ogrenecegiz
		
		int arr[] = {10,20,30}; // int[] arr seklinde de kullanilabilir
								// Bu ornekte Array'in elemanlarini direk yazdigim icin
								// uzunluk belirtmeye ihtiyac kalmadi.
								// Bu kullanimda max eleman sayisi (length) yazdigimiz elaman sayisidir. yani 3 eleman vardir
		System.out.println(arr);// Array bir objedir.
								// Eger direk olarak Array'i yazdirmak isterseniz Java ref'i yazdirir
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[] = new String[5]; // [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim)); // [Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim)); // [Ali, Veli, Hasan]
		
		// takim[3]="Mehmet"; // Java Run Time programdir, dolayisiyla array progarmi calistirinca
						   // olsturulur. 36. satirda syntax olarak hata olmadigindan CTE olmaz.
						   // program calistiginda 3. index olmadigi icin RTE verir.
		
		// Array'de ki bir elemani update etme
		// Veli'nin yerine Kemal gelsin
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim)); // [Ali, Veli, Kemal]
		
		// Bir Array'in uzunlugunu nasil bulabiliriz?
		System.out.println(takim.length); // 3
										  // String'deki length() idi Array'de length (parantez yoktur)
		// Array'daki son elemani Mehmet yapin
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim)); // [Ali, Kemal, Hasan, null, Mehmet]
		
		// eger eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length %2 ==1) {
			int ortaIndex= (takim.length-1)/2;
			takim[ortaIndex]="Can";			
		}
		System.out.println(Arrays.toString(takim));

	}

}
