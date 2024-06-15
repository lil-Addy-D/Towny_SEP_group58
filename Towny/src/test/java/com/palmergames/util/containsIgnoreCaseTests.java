package com.palmergames.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(OrderAnnotation.class)
public class containsIgnoreCaseTests {
	@Test
	@Order(1)
	void testContainsBranch() {
		List<String> list = Arrays.asList("alpha", "beta", "gamma");
		String input = "BETA";
		boolean result = StringMgmt.containsIgnoreCase(list, input);
		assertTrue(result);
	}

	@Test
	@Order(2)
	void testDoesNotContainBranch() {
		List<String> list = Arrays.asList("alpha", "beta", "gamma");
		String input = "delta";
		boolean result = StringMgmt.containsIgnoreCase(list, input);
		assertFalse(result);
	}

	@Test
	@Order(3)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageContainsIgnoreCase);
	}
}
