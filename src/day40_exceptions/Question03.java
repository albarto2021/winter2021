package day40_exceptions;

public class Question03 {

	public static void main(String[] args) {

		String s = "";
		try {
			s += "t";
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.print(s);

		/*
		 * try blogu s String'ine t eklemeye calisir. sadece t oldu (hiclige ekledi).
		 * try calistigi icin catch calismaz o yuzden "c" eklemedik String'imize.
		 * Finally her durumda calisacagi icin "f" ekleyecektir. String'imiz ta oldu. a
		 * bloglar disinda oldugu icin gene calisacak String'e ekleyecek ve tfa olur
		 * cevabim.
		 */

	}

}
