package day40_exceptions;

public class Question02 {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 0;
		try {
			System.out.println(sayi1 / sayi2);
		} catch (ArithmeticException e) {
			System.out.println("Kodda hata var...");
			e.printStackTrace();
		} finally {
			System.out.println("connection'i durdur....");
		}
	}
}
