package com.palmergames.util;

import java.util.HashMap;
import java.util.Map;

public class CoverageUtil {
		public static final Map<String, Boolean> branchCoverageRemArgs = new HashMap<>();

		static {
			branchCoverageRemArgs.put("remArgs_branch_1", false);
			branchCoverageRemArgs.put("remArgs_branch_2", false);
			branchCoverageRemArgs.put("remArgs_branch_3", false);
		}

		public static void coverBranchRemArgs(String branchName) {
			branchCoverageRemArgs.put(branchName, true);
		}

		public static void printCoverage(Map<String, Boolean> branchCoverage) {
			for (Map.Entry<String, Boolean> entry : branchCoverage.entrySet()) {
				System.out.println(entry.getKey() + " was " + (entry.getValue() ? "hit" : "not hit"));
			}
		}
	

}
