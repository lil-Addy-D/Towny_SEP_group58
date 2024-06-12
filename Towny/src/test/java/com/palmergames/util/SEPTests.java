package com.palmergames.util;

import com.palmergames.util.CoverageUtil;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class SEPTests {
	
	@Test
	void printCoverage() {
		// Print coverage
		//CoverageUtil.printCoverage(CoverageUtil.branchCoverageRemArgs);
		CoverageUtil.printCoverage(CoverageUtil.branchCoverageIsAllUpperCase);

	}

}
