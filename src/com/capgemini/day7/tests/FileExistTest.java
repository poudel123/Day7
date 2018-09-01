package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

public class FileExistTest {
	@Test
	void testFile() {
		File  file=new File("C:\\\\priyanka poudel");
		assertEquals(true, file.exists());

	
	}
}
