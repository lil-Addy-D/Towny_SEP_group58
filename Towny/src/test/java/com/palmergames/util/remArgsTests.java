package com.palmergames.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class remArgsTests {
	@Test
	@Order(1)
	void testArrLengthZero(){
		String[] input = {};
		String[] result = StringMgmt.remArgs(input, 1);
		assertArrayEquals(input, result);
	}

	@Test
	@Order(2)
	void testArrLengthSmallerThanIndex(){
		String[] input = {"a", "b", "c"};
		int index = 5;
		String[] result = StringMgmt.remArgs(input, index);
		assertArrayEquals(new String[0], result);
	}

	@Test
	@Order(3)
	void testExpected(){
		String[] input = {"a", "b", "c", "d", "e"};
		int index = 2;
		String[] result = StringMgmt.remArgs(input, index);
		String[] expected = {"c", "d", "e"};
		assertArrayEquals(expected, result);
	}

	@Test
	@Order(4)
	void printCoverage() {
		// Print coverage
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageRemArgs);
	}

}
