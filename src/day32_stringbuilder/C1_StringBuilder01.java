package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Rumeysa");
		System.out.println(sb1); // Rumeysa
		
		sb1.append(" ").append("Cetinturk");
		System.out.println(sb1); // Rumeysa Cetinturk
		
		String cumle= "Javayi cok sever";
		sb1.append(cumle, 6, 10);
		System.out.println(sb1); // Rumeysa Cetinturk cok
		
		System.out.println(sb1.length()); // 21
		System.out.println(sb1.capacity()); // 23 (7+16)
		
		System.out.println(sb1.charAt(1)); // u
		
		sb1.charAt(5); // bize bilgi getiren method'lar SB'i degistirmez
		System.out.println(sb1); // Rumeysa Cetinturk cok
		

	}

}
