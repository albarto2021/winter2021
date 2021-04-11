package day49_maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps04_VeriTabani {

	public static void main(String[] args) {		

		
		String dosyaYolu= "C:\\Users\\asus\\Desktop\\MapVeriTabani.csv";
		
		Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap); // {id=101, adres=Ankara, isim=Ali}
	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {
		Map<String,String> eklenecekMap = new HashMap<>();
				
					
			try {
				BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
				String satir=br.readLine();
				
				
				while(satir != null) {
					
					String keyValueArr[]=satir.split(";");
					eklenecekMap.put(keyValueArr[0], keyValueArr[1]);				
					satir=br.readLine();				
				
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();  // detayli hata raporu verir
			}
	

		return eklenecekMap;
	}

}
