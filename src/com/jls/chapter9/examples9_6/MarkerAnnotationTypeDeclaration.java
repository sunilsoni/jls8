package com.jls.chapter9.examples9_6;

//Example 9.6.1-2. Marker Annotation Type Declaration
@Preliminary
public class MarkerAnnotationTypeDeclaration {
	public static void main(String[] args) {
		System.out.println();
	}
}

/**
 * An annotation with this type indicates that the specification of the
 * annotated API element is preliminary and subject to change.
 */
@interface Preliminary {
	
}