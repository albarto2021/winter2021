package day12_stringmanupolitian;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() method'u karsilastirdigi String'lere case sensetive
		// (buyuk kucuk harf duyarliligi) olmaksizin bakar.
		// String'ler ayni ise true, ayni degilse faise döner
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali Can ";
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); // true

	}

}
