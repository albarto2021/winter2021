package day39_Exeptions;

public class Exeptions05 {

	public static void main(String[] args) {
		
		// null olarak tanimlanmis obje ile uygun olmayan bir islem yapmaya calistigimizda
		// Java NullPointerException verir
		// Uncheked exeption'dir
		
		
		String str1=" ";
		String str2="";
		String str3=null; // null bir deger degildir sadece str3'un hicbirseye esit olmadiginþ
						  // soyleyen bir isaretcidir (pointer)
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
		//System.out.println(str3.length()); // NullPointerExeption
		
		System.out.println(str3+"bos"); // nullbos
		System.out.println(str3.concat("bos")); // NullPointerException
	}

}
