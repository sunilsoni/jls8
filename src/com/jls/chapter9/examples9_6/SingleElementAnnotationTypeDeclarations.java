package com.jls.chapter9.examples9_6;

//Example 9.6.1-3. Single-Element Annotation Type Declarations
@Copyright(value = "Copyright")
@Endorsers(value = "Endorsers")
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

/**
 * Associates a list of endorsers with the annotated class.
 */
@interface Endorsers {
	String[] value();
}

interface Formatter {
}

// Designates a formatter to pretty-print the annotated class
@interface PrettyPrinter {
	Class<? extends Formatter> value();
}

/**
 * Indicates the author of the annotated program element.
 */
@interface Author {
	Name value();
}

/**
 * A person's name. This annotation type is not designed to be used directly to
 * annotate program elements, but to define elements of other annotation types.
 */
@interface Name {
	String first();

	String last();
}

@interface Quality {
	enum Level {
		BAD, INDIFFERENT, GOOD
	}

	Level value();
}

//Example 9.6.2-1. Annotation Type Declaration With Default Values
@interface RequestForEnhancementDefault {
	int id(); // No default - must be specified in
	// each annotation

	String synopsis(); // No default - must be specified in
	// each annotation

	String engineer() default "[unassigned]";

	String date() default "[unimplemented]";
}