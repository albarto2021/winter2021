package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-23T17:41:25.261945500
		
		System.out.println(ldt.toString()); // 2021-03-23T17:42:23.077026100
		
		String time= ldt.toString();
		
		System.out.println(time.startsWith("2021")); // true
		}
}
