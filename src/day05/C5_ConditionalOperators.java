package day05;

public class C5_ConditionalOperators {
	
	public static void main(String[] args) {
		// conditional = þart
		// AND && , OR || (Alt-)
		// AND operatoru mukemmelliyetcidir. Hepsi true olursa sonucu true yapar, 
		// 		bir tane bile false olsa sonucu false yapar.
		//		matmatikte ki carpma islemi gibidir (true =1 false=0)
		
		boolean isTrue=5>4 && 7-3>0;
		
		System.out.println(isTrue); //true
		
		int x=10;
		int y=5;
		
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true
		
		System.out.println(x+y<0 && x-y>0); // false
		
		
		// OR operatoru ise optimistir.
		// Verilen karsilastirmalardan 1 tanesi bile dogru ise sonucu true verir.
		// (true=1 false=0 ise toplama islemi gibi dusunulebilir)
		System.out.println(x<y || x+y<0 || x*y>0); // true
				
	}

}
