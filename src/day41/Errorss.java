package day41;

public class Errorss {

	public static void main(String[] args) {
		
		System.out.println(20/0); // RTE degil RunTimeExeption
		
		// String str="asd; // CTE dur.. cunku cift tirnagi tamamlamadikca kod calismaz
		// bu tur yazimdan kaynaklanan kolayca duzeltilebilir.
		
		// Java'da Error dendiginde onune gecilmeyen kod ile cozulmeyene
		// sistemden kaynakli buyuk hatalar  kastedilir
		
		// Error'lar unchekede'dir ve java bunlari ongoremez
		// Aancak gerceklestiginde kodun calismasi durdurulur
		
		String str=" ";
		for (int i = 0; i < 1000000; i++) {
			str+=i;
		}

	}

}
