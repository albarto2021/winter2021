package day40_exceptions;

public class RunnerChekedExeption {

	public static void main(String[] args) throws InvalidEmaildCheckedExeption {
		
		String email="rasit@gmail.com";
		
		mailDogrula(email);
		

	}

	public static void mailDogrula(String email) throws InvalidEmaildCheckedExeption {
		if (email.contains("@gmail.com") || email.contains("@hotmail.com" )) {
			System.out.println("Mailiniz basariyla kaydedildi");
		}else {
			throw new InvalidEmaildCheckedExeption("email uygun degil");
		}
		
	}

}
