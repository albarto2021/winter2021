package day22_constructor;

public class CarUret {
	// soru ...... constructor bu class'da nerede?
	// su anda bu class'da gorunur bir constructor yok
	// bir class olusturuldugunda Java bu class'danobje uretebilecegini bilir.
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir
	// default constructor parametresizdir. Dolayisiyla sadece hic bir ozelligi tanimlanmayan 
	// objeler uretir (tisort uret demek gibidir.)
	// default constryctor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	
	// eger biz sonradan bir constructor yazarsak, Java default constructor'u iptal eder.
	
	// Bir constructor olusturalim
	
	public CarUret (){
		
	}
	// Kurallar: 1- ismi class ile ayni olmalidir. (dolayisi ile buyuk harfle baslar) 
	// 2- Constructor return type'a sahip degildir.
	// 3- constructor isminden sonra mutlaka parantez olur () ama parametre olmasi opsiyoneldir.
	// 4- bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modifier yazilir.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz.
	// bu class'da olusturulacak objelere ait tum ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasa da olur.
	// (kaliphane gibi)

	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
