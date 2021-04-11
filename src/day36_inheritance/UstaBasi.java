package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {
	
	public String bolum="Takimhane";
	public int sorOldIscisay=20;
	

	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		// Objeyi torun class'inda olustruunca 3 class'a da ulasabiliriz.
		
		System.out.println(ub1.bolum); // Takimhane
		System.out.println(ub1.sorOldIscisay); // 20
		System.out.println(ub1.saatUcreti); // 20
		System.out.println(ub1.isim); // Mehmet
		
		// List<String> list=new ArrayList<>();
		// Object str=new String("Hasan");
		Isci ub2=new UstaBasi();
		// Extend ile birbirine bagli olan class'larda IS-A relation olan
		// Data turleri istege bagli olarak kullanilabilir
		// Daha genis Data turu Yazmanin avantaji:
		// Kapsamin daha genis olmasi
		// Daha genis Data turu Yazmanin dezavantaji:
		// Data turu olarak sectigimiz class ve parent(larina) ait datalara ulasabiliriz
		System.out.println(ub2.departman); // Isci
		System.out.println(ub2.izindeMi); // Personel
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id); // Personel
		

	}

}

