package day36_inheritance;

class Derived {

public  Derived(String temp) {
	System.out.println("Derived class " + temp);

	
		//soru 1
		// asagidaki CTE'lar nasil giderilir ?
		// ve duzeltiginde sonuc ne olur ?
	/*
		class Derived {
		
		}}
		*/
class Test01 extends Derived {
public Test01 (String temp) { 
	super(temp);
	System.out.println("Test class " + temp);
		    
}
public void main(String[] args) {
	Test01 obj = new Test01("Halime");
		    
		}
		}
	
		
		
		
	}

}
