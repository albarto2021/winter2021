package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-23T18:13:19.768846500
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");	
		/*
		 yy: yilin son iki rakamini
		 yyyy: yilin tamamini
		 M: ay sirasini verir Mart icin : 3
		 MM: ay sirasini verir Mart icin : 03
		 MMM: ay isminin ilk uc harfini verir
		 MMMM: ay isminin tamamini verir
		 */
		System.out.println(dtf.format(ldt)); // 21/Mart/23 06:15
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd"); // 21/Mar/23	
		System.out.println(dtf2.format(ldt)); // 21/Mart/23 06:15
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // HH : 24 saat'lik sisteme gore
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm"); // hh : pm/am sistemine gore
		System.out.println(dtf3.format(ldt)); // 18:23   * 24 saat'lik sisteme gore
		System.out.println(dtf4.format(ldt)); // 06:23   * pm/am sistemine gore
		
		LocalDate dogumTarihi = LocalDate.of(1977, 9, 26);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim = Period.between(dogumTarihi, bugun); // P43Y-5M-27D
		System.out.println(benimYasim);
		
		int yas = Period.between(dogumTarihi, bugun).getYears(); 
		System.out.println(yas); // 43
	}
}
