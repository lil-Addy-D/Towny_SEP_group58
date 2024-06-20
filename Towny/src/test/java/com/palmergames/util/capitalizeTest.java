package com.palmergames.util;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class capitalizeTest {
	
	@Test
	@Order(1)
	void emptyAndNullStringTest() {
		String input1 = "";
		String input2 = null;

		String output1 = StringMgmt.capitalize(input1);
		assertEquals(input1, output1);

		String output2 = StringMgmt.capitalize(input2);
		assertEquals(input2, output2);
	}

	@Test
	@Order(2)
	void capitalizationTest() {
		String input1 = "addy";
		String input2 = "Addy";

		String output1 = StringMgmt.capitalize(input1);
		assertEquals("Addy", output1);

		String output2 = StringMgmt.capitalize(input2);
		assertEquals("Addy", output2);
	}
	
	@Test
	@Order(3)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageCapitalize);
	}
}
