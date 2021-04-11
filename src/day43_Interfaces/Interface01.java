package day43_Interfaces;

public interface Interface01 {
	
	public void motor(); // interface icinde abstract method'lar ve 
						 // OZEL concrete method'lar olabilri
	
	/*
	 Bir abstract method'un bodysi olmadigi icin o method'un istenen dinamik ozelligi 
	 nasil gerceklestirecegini bilmemiz mumkun degil
	 Saedece ne yapacagini biliriz
	 
	 Bu method bize susnu anlatir;
	 Beni inherit eden concrete class'in dinamik motor ozelligi olmalidir.
	 */
	
	void vites(); // Beni inherit eden concrete class'in dinamik vites ozelligi olmalidir.
	abstract void kasa(); // Beni inherit eden concrete class'in dinamik kasa ozelligi olmalidir.
	
	// interface'de sadece ABSTRACT, PUBLIC methodlar olur
	// bu iki keyword'u yazsakta yazmasakta Java tum methodlari bu sekilde kabul eder
	
	// Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	// bir class sonradan bazi keyword'ler yazilarak interface yapilamaz
	
	String ISIM = "Mustafa"; // Java isism kelimesini italic ve bold yapti
							// demek ki tum variable'ler final ve statictir
	

}
