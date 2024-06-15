package com.palmergames.util;

import java.util.HashMap;
import java.util.Map;

public class CoverageUtil {
		public static final Map<String, Boolean> branchCoverageRemArgs = new HashMap<>();
		public static final Map<String, Boolean> branchCoverageSubArray = new HashMap<>();
	    public static final Map<String, Boolean> branchCoverageIsAllUpperCase = new HashMap<>();
		public static final Map<String, Boolean> branchCoverageCapitalize = new HashMap<>();
		public static final Map<String, Boolean> branchCoverageContainsIgnoreCase = new HashMap<>();
	public static final Map<String, Boolean> branchCoverageParseOnOff = new HashMap<>();
		
		static {
			branchCoverageRemArgs.put("remArgs_branch_1", false);
			branchCoverageRemArgs.put("remArgs_branch_2", false);
			branchCoverageRemArgs.put("remArgs_branch_3", false);
		}
		
		static{
			branchCoverageIsAllUpperCase.put("isAllUpperCase_branch_1", false);
			branchCoverageIsAllUpperCase.put("isAllUpperCase_branch_2", false);
			branchCoverageIsAllUpperCase.put("isAllUpperCase_branch_3", false);
		}


		static {
			branchCoverageSubArray.put("subArray_branch_1", false);
			branchCoverageSubArray.put("subArray_branch_2", false);
			branchCoverageSubArray.put("subArray_branch_3", false);
		}
		
		
		static {
			branchCoverageCapitalize.put("capitalize_branch_1", false);
			branchCoverageCapitalize.put("capitalize_branch_2", false);
		}
	
		static {
		branchCoverageContainsIgnoreCase.put("containsIgnoreCase_branch_1", false);
			branchCoverageContainsIgnoreCase.put("containsIgnoreCase_branch_2", false);
	}

	static {
		branchCoverageParseOnOff.put("parseOnOff_branch_1", false);
		branchCoverageParseOnOff.put("parseOnOff_branch_2", false);
		branchCoverageParseOnOff.put("parseOnOff_branch_3", false);
	}
		

		public static void coverBranchRemArgs(String branchName) {
			branchCoverageRemArgs.put(branchName, true);
		}
		public static void coverBranchSubArray(String branchName) {
			branchCoverageSubArray.put(branchName, true);
		}

	    public static void coverBranchIsAllUpperCase(String branchName) {
			branchCoverageIsAllUpperCase.put(branchName, true);
	    }
		
		public static void coverBranchCapitalize(String branchName) {
			branchCoverageCapitalize.put(branchName, true);
		}

	public static void coverBranchContainsIgnoreCase(String branchName) {
		branchCoverageContainsIgnoreCase.put(branchName, true);
	}
	public static void coverBranchParseOnOff(String branchName) {
		branchCoverageParseOnOff.put(branchName, true);
	}
	public static void printCoverage(Map<String, Boolean> branchCoverage) {
			int coveredCount = 0;
			for (Map.Entry<String, Boolean> entry : branchCoverage.entrySet()) {
				System.out.println(entry.getKey() + " was " + (entry.getValue() ? "hit" : "not hit"));
				if (entry.getValue()) {
					coveredCount++;
				}
			}
			double coveragePercentage = (coveredCount / (double) branchCoverage.size()) * 100;
			System.out.println("Coverage: " + coveragePercentage + "%");
		}
	

}
