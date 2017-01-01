package com.jls.chapter9.examples9_6;

@RequestForEnhancement(date = "1-1-2017", engineer = "Sunil Soni", id = 10, synopsis = "Math")
public class AnnotationTypeDeclaration {
	public static void main(String[] args) {
System.out.println("RequestForEnhancement--");
	}
}

/**
 * Describes the "request-for-enhancement" (RFE) that led to the presence of the
 * annotated API element.
 */
@interface RequestForEnhancement {
	int id(); // Unique ID number associated with RFE

	String synopsis(); // Synopsis of RFE

	String engineer(); // Name of engineer who implemented RFE

	String date(); // Date RFE was implemented
}