package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TodaysDateTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getDayOfWeek().name() + " " + localDate.getMonth().name() + " "
		      + localDate.getDayOfMonth() + " " + localDate.getYear());
		String dateFormate = localDate.getDayOfWeek().name() + " " + localDate.getMonth().name() + " "
			      + localDate.getDayOfMonth() + " " + localDate.getYear();
		assertEquals("SATURDAY SEPTEMBER 1 2018",dateFormate);
	}

}
