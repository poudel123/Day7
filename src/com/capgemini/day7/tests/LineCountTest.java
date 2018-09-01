package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileLine;

class LineCountTest {

	@Test
	void test() {
		assertEquals(14, FileLine.LineCount());
	}

}
