package com.jls.chapter9.examples9_7;

//Example 9.7.1-1. Normal Annotations
public class NormalAnnotations {
	@RequestForEnhancement(id = 4561414, synopsis = "Balance the federal budget", date = "", engineer = "")
	public static void balanceFederalBudget() {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static void main(String[] args) {

	}
}

@interface RequestForEnhancement {
	int id(); // Unique ID number associated with RFE

	String synopsis(); // Synopsis of RFE

	String engineer(); // Name of engineer who implemented RFE

	String date(); // Date RFE was implemented
}