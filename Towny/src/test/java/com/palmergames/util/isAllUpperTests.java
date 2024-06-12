package com.palmergames.util;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class isAllUpperTests {
	@Test
	@Order(1)
	void testEmptyString(){
		String input = "";
		Boolean result = StringMgmt.isAllUpperCase(input);
		assertEquals(false, result);
	}

	@Test
	@Order(2)
	void testLowercase(){
		String input1 = "TESTiNg";
		Boolean result1 = StringMgmt.isAllUpperCase(input1);
		assertEquals(false, result1);
		
		String input2 = "TESTINg";
		Boolean result2 = StringMgmt.isAllUpperCase(input2);
		assertEquals(false, result2);

		String input3 = "testing";
		Boolean result3 = StringMgmt.isAllUpperCase(input3);
		assertEquals(false, result3);
	}

	@Test
	@Order(3)
	void testUppercase(){
		String input = "TESTING";
		Boolean result = StringMgmt.isAllUpperCase(input);
		assertEquals(true, result);
	}

	@Test
	@Order(4)
	void printCoverage() {
		// Print coverage
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageIsAllUpperCase);
	}
}
