package day36_inheritance;

public class Test03 {
	/*
	class Soru03 {
	    public void getDetails() { // 5. olarak buraya geldik // 8. olarak burayi tekrar okur 
	        System.out.println("Derived class "); // 6. olarak bunu Ekrana yazdirdik. // 9. olarak burayi 2. kez yazdirir.
	    }   
	    }
	public class Test03 extends Soru03 {
	    public Test03() { // 2. olarak buraya geldi extends old. icin gizli bir superr var burada onu okur. Ama default cons. olmadigi icin yola devam
	        System.out.println("Test class "); // 3 // Ekrana bunu yazdirdi //
	        super.getDetails(); // 4 // burada getDetails methoduna git diyor oraya gidiyoruz.
	    }
	    
	    public static void main(String[] args) {
	       Test03 obj = new Test03(); // Ilk burasi caliscak . Cons.'dan dolayi oraya gider.
	        obj.getDetails(); // 7. olarak bunu okur burada da obje olusturduk, obje uzerinden yine method cagirdik 
	        // Test03 Class'inda getDetails method'u var mi diye bakariz. Yok, fakat extends oldugu icin parent class'a gider yani Soru03'e
	         * burada bakar getDetails() methodu var onu okur ve 2. kez Derived Class yazdirir.
	    }
*/

	public static void main(String[] args) {
		// soru3
		class Okul {
		    public void getDetails() {
		        System.out.println("Derived class ");
		    }   
		    }
		public class Test03 extends Okul {
		    public Test03() {
		        System.out.println("Test class ");
		        super.getDetails();
		    }
		    
		    public static void main(String[] args) {
		       Test03 obj = new Test03();
		        obj.getDetails();
		    }
		}

	}

}
