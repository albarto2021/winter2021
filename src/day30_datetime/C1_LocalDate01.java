package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		// Java'da sadece tarih kullanmak istiyorsak
		// LocalDate Class'indan bir obje uretiriz
		
		LocalDate tarih= LocalDate.now(); // 2021-03-23
		System.out.println(tarih);
		
		System.out.println(tarih.plusWeeks(20)); // 2021-08-10
		System.out.println(tarih.plusDays(500)); // 2022-08-05
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // 2024-09-04
		
		System.out.println(tarih.minusMonths(15)); // 2019-12-23
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 2017-11-13
		
		System.out.println(tarih.getDayOfYear()); // 82
		System.out.println(tarih.getDayOfMonth()); // 23
		System.out.println(tarih.getMonthValue()); // 3
		System.out.println(tarih.getDayOfWeek());  // TUESDAY
		LocalDate dogumGunu= LocalDate.of(1978, 11, 2);
		System.out.println(dogumGunu.getDayOfWeek()); // THURSDAY
		
		System.out.println(tarih.getMonth()); // MARCH		
		
		System.out.println(tarih.isLeapYear()); // false
		
		// Eger suan ki tarih ile degil de eski bir tahrih ile islem yapacaksak
		// LocalDate.of() methodunu kullaniyoruz
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // true
		System.out.println(tarih1.isBefore(tarih2)); // false		
	}
}
