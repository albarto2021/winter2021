package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da saat ile islem yapmak icin
		// LocalTime Class'indan obje kullaniriz
		
		LocalTime saat = LocalTime.now();	
		System.out.println(saat); // 17:16:22.527314
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		LocalTime saat2 = LocalTime.now();	
		System.out.println(saat2); // 17:18:20.295526100
		System.out.println(saat); // 17:20:06.564152900
		
		System.out.println(saat.plusHours(15)); // 08:21:14.304464400
		
		System.out.println(saat.getSecond()); // 5
		System.out.println(saat.minusSeconds(1564567844)); // 07:23:21.444102600
		
		System.out.println(saat.now(ZoneId.of("Japan"))); // 23:37:59.229930500
		System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 09:39:38.208035900
	}
}
