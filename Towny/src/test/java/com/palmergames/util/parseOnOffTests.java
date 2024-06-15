package com.palmergames.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(OrderAnnotation.class)
public class parseOnOffTests {

	@Test
	@Order(1)
	void testOnBranch() throws Exception {
		String input = "on";
		boolean result = StringMgmt.parseOnOff(input);
		assertTrue(result);
	}

	@Test
	@Order(2)
	void testOffBranch() throws Exception {
		String input = "off";
		boolean result = StringMgmt.parseOnOff(input);
		assertFalse(result);
	}

	@Test
	@Order(3)
	void testInvalidBranch() {
		String input = "invalid";
		Exception exception = assertThrows(Exception.class, () -> {
			StringMgmt.parseOnOff(input);
		});
		assertNotNull(exception);
	}

	@Test
	@Order(4)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageParseOnOff);
	}
}

