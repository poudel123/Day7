package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat7;

class Date7Test {

	@Test
	void testDateFormat() throws ParseException {
		
		
			
					 assertEquals("12/01/2012",DateFormat7.DateFormat7("12012012"));
					 assertEquals("12 January, 2012",DateFormat7.DateFormat07("12012012"));
		    
		}



}
