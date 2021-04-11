package day08_ifelseifnestedif;

public class C2_Nestedif {

	public static void main(String[] args) {
		// Nested : ic ice
		/*
		 Verilen cinsiyet ve yas icin kisinin emekli olup olamayacagini
		 yazdiran bir java programini yaziniz
		 Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 calisan erkekse 65 yasindan buyukse emekli olabilir.
		 */
		
		String cinsiyet="ERKEK";
		int yas = 50;
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas>65) {
			System.out.println("Emekli olabilirsin");			
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65){
			System.out.println("Emekli olamazsin");
		} else if(cinsiyet.equalsIgnoreCase("kadin")&& yas>60) {
			System.out.println("Emekli olabilirsin");			
		} else if (cinsiyet.equalsIgnoreCase("kadin")&& yas<60){
			System.out.println("Emekli olamazsin");
		}else {
			System.out.println("Cinsiyet veya Yas tanimsiz");
		}
		
		
		
		System.out.println("Nested if ile sonuc");
		
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {
				System.out.println("Erkek yas negatif olamaz");				
			} else if(yas<65){
				System.out.println("Bu yastaki erkek emekli olamaz");
			}else {
				System.out.println("Emekli olabilirsin");
			}
			
			
		} else if(cinsiyet.equalsIgnoreCase("kadin")){
			if (yas<0) {
				System.out.println("Kadin yas negatif olamaz");				
			} else if(yas<60){
				System.out.println("Bu yastaki kadin emekli olamaz");
			}else {
				System.out.println("Emekli olabilirsin");
			}
					

		} else {
			System.out.println("Yazdiginiz cinsiyet sisteme kayitli degil");
		}

	}

}
