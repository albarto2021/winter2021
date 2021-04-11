package day40_exceptions;

public class InvalidEmaildCheckedExeption extends Exception {
	
	private static final long serialVersionUID = 1L;
	// Java exeption'larin tekrarsiz olmasini saglamak icin her exeption'a unique bir kod verir.

	public InvalidEmaildCheckedExeption(String message) {
		// cons. olusturmak icin class ismini yazip suslu parantez yazmak. 
		// sonra String parametreli cons olusturduk
		super(message);  
	}

}
