package day36_inheritance;

public class Test02 {

	public static void main(String[] args) {
		// 2.soru
		class Derived {
			public void getDetails() {
			    System.out.println("Derived class");
			}
			}
			public class Test02 extends Derived {
			protected Test02() {
			    System.out.println("Test class");
			}
			public static void main(String[] args) {
			    Test02 obj = new Test02();
			    
			}
			} 

	}

}
