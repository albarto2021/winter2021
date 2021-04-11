package day43_Interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veye method
		// baska class'dan classIsmi.methodIsmi seklinde cagrilabilir
		
		Interface02.denem2();
		
		// default keyword'u ile olusturdugumuz method ise 
		// obje uzerinden cagrilabilir
		
		InterfaceRunner obj1= new InterfaceRunner();
		obj1.deneme();
		
		

	}

}
