package day39_Exeptions;

import java.util.ArrayList;
import java.util.List;

public class Exeptions06 {

	public static void main(String[] args) {
		// 
		
		int arr[]= {1,2,5,6};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 6
		// System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
		List<String> list= new ArrayList<>();
		list.add("Bahattin");
		list.add("Kazim");
		list.add("Celil");
		System.out.println(list);
		System.out.println(list.get(1)); // Kazim
		System.out.println(list.get(3)); // IndexOutOfBoundsException

	}

}
