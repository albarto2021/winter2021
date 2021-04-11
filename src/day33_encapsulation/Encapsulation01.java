package day33_encapsulation;

import day20_scope.Scope1;
import day21_Scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP consept
		// Object Oriented Programing
		// Bir proje kapsaminda ki class'larda olusturulan variable ve method'larin 
		// baska class'larda tekrar tekrar yazilmamasi var oldugu class'dan obje uretilerek
		// bu variable ve method'larin istendigi kadar kullanilmasidir. (reusability)
		// Write Once Resue Anywhere
		
		// Scope6 class'indeki variable ve methodlara ulasmak istiyorum
		// bunun icin Scope6 class'indan obje uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		// esitligin sol tarafi declaration
		// declaration 2 parcadir ilk parca data turu, ikinci kisim isim
		// non- primitive'ler icin data turu ayni zamanda class ismi olabilir
		// esitligin saginda ise deger, 2 parcadan olusur
		// new keyword'u, ikincisi de constructor
		// hangi class'tan obje uretmek istersek o class'in contructor'unu kullaniriz
		obj1.num1=10;
		System.out.println(obj1.num1); //10		
		obj1.add();
		
		
		// deneme() method'unu main method icinden cagirabilir miyiz?
		// deneme() method'u static olmadigi icin main method'dan direk cagrilamaz
		// bunun yerine icinde oldugumuz class'tan bir obje uretip onun uzerinden 
		// static olmayan method'larida cagirabiliriz
		Encapsulation01 obj3=new Encapsulation01();
		obj3.deneme();
		

	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tum Class'lardan 
		// public variable ve method'lara istedigim yerden obje ureterek ulasabilirim
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska 
		// package'lerden ulasmak icin extra islem yapmamiz gerekir
		Scope1 obj2 =new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
		// Ben istedigim class'dan obje uretip oradaki class uyelerine ulasabilirim...
	}
}
