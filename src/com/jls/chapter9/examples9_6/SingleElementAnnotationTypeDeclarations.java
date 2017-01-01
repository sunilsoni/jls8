package com.jls.chapter9.examples9_6;

//Example 9.6.1-3. Single-Element Annotation Type Declarations
@Copyright(value = "Copyright")
public class SingleElementAnnotationTypeDeclarations {
	public static void main(String[] args) {
		System.out.println();
	}
}

/**
 * Associates a copyright notice with the annotated API element.
 */
@interface Copyright {
	String value();
}