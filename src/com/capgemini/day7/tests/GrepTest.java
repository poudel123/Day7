package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Grep;

class GrepTest {

	@Test
	void testGrepApp() {
		File file=new File("C:\\Users\\ppoudel\\Documents\\abc.txt");
		assertEquals(true,Grep.stringSearch(file,"priyanka"));

	}

}
