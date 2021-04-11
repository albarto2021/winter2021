package Day28_foreachloop;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		// Bir ineger array olusturunuz ve   
		// bu array'deki tum sayilarin carpimini for-each kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		int arr[]= {1,2,1,2,4,3,1,2};
		
		int carpim=1;
		
		for (int each : arr) {
			
			carpim*=each;			
		}
		System.out.print("array'in tum elemanlarin carpimi : " + carpim);
		
	}

}
