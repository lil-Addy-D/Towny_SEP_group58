package com.palmergames.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class checkOrCreateFolderTests {

	@Test
	@Order(1)
	void testFolderExists() {
		String folderPath = "existingFolder";
		File folder = new File(folderPath);
		folder.mkdir();

		boolean result = FileMgmt.checkOrCreateFolder(folderPath);
		assertTrue(result);

		folder.delete();
	}

	@Test
	@Order(2)
	void testFolderCreationFailed() {
		String folderPath = "";

		boolean result = FileMgmt.checkOrCreateFolder(folderPath);
		assertFalse(result);
	}

	@Test
	@Order(3)
	void printCoverage() {
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageCheckOrCreateFolder);
	}
}
