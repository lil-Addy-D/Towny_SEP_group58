package com.palmergames.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class trimMaxLengthTests {

	@Test
	@Order(1)
	void testStringShorterThanLength() {
		String input = "short";
		int length = 10;
		String result = StringMgmt.trimMaxLength(input, length);
		assertEquals(input, result);
	}

	@Test
	@Order(2)
	void testStringLongerThanLength() {
		String input = "this is a long string";
		int length = 4;
		String result = StringMgmt.trimMaxLength(input, length);
		assertEquals("this", result);
	}

	@Test
	@Order(3)
	void testUnsupportedOperationException() {
		String input = "short";
		int length = 2;
		assertThrows(UnsupportedOperationException.class, () -> {
			StringMgmt.trimMaxLength(input, length);
		});
	}

	@Test
	@Order(4)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageTrimMaxLength);
	}
}
