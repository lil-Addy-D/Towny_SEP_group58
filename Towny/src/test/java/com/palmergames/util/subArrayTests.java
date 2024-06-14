package com.palmergames.util;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class subArrayTests {
	
	@Test
	@Order(1)
	void testEmpty() {
		String[] input = {};
		int start = 0;
		int end = 0;
		String[] output = StringMgmt.subArray(input, start, end);
		assertArrayEquals(input, output);
	}
	
	@Test
	@Order(2)
	void testStartGreaterThanEnd() {
		String[] input = {"A", "d", "d", "y"};
		int start = 2;
		int end = 1;
		String[] output = StringMgmt.subArray(input, start, end);
		assertArrayEquals(new String[0], output);
	}
	
	@Test
	@Order(3)
	void testSplitting() {
		String[] input = {"l", "i", "l", "A", "d", "d", "y", "D"};
		int start = 3;
		int end = 7;
		String[] output = StringMgmt.subArray(input, start, end);
		assertArrayEquals(new String[]{"A", "d", "d", "y"}, output);
	}
	
	@Test
	@Order(4)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageSubArray);
	}
}
