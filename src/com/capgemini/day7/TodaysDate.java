package com.capgemini.day7;

import java.time.LocalDate;

public class TodaysDate {
	public static String format() {
      //String LocalDate.now;
		LocalDate.now();
		String today=LocalDate.now().getDayOfWeek()+","+LocalDate.now().getMonth()+" "+LocalDate.now().getDayOfMonth()+","+LocalDate.now().getYear();
		System.out.println(today.toString());
		return today;
	}


}
