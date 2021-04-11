package day14_methodcreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		
		String str="Java cok guzel";
		
		// 1) Java method'larin sadece ismine degil, isim + parametre'lere bakar
		// sadece parametre sayisi degil parametre'lerin data tiplerine de bakar
		
		str.endsWith("el"); // Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
							// bu method'u kullanmak icin bu metho'u kontrol ettikten sonra
							// bana rapor olarak ne getirdigini bilmem lazim(true / false)
		
		// 2) Bir method olusturdugumuzda method'un ne yapacagina
		//    ve gorevi yaptiktan sonra bana ne döndürecegine bastan karar vermeliyiz.
		
		// 2) Bir method olusturulurken " str.indexOf(String str, int fromIndex) " 
		//	  de oldugu gibi
		//	  disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
		// 	  deklare etmeliyiz
		
		//	  Method'u calistirmak istedigimde (Method'u cagirmak) Parametre olarak
		//	  declare edilen data tiplerine uygun degerlere girmeliyiz.
		//	  girilen bu degerlere ARGUMENT denir.	 
		
		//str.indexOf(va, 1) // 
	}

}
