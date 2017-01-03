package com.jls.chapter9.examples9_7;

import java.lang.annotation.Repeatable;


//Example 9.7.3-1. Single-Element Annotations
public class SingleElementAnnotations {

	

	public static void main(String[] args) {
		@Foo
		int f;
	}
}

@Copyright("2002 Yoyodyne Propulsion Systems, Inc.")
class OscillationOverthruster {

}

/**
 * Associates a copyright notice with the annotated API element.
 */
@interface Copyright {
	String value();
}

@Endorsers({ "Children", "Unscrupulous dentists" })
class Lollipop {

}

/**
 * Associates a list of endorsers with the annotated class.
 */
@interface Endorsers {
	String[] value();
}

@Endorsers("Epicurus")
class Pleasure {

}

class GorgeousFormatter implements Formatter {
}

@PrettyPrinter(GorgeousFormatter.class)
class Petunia {
}

// Illegal; String is not a subtype of Formatter
@PrettyPrinter(String.class)
class Begonia {
}

// Designates a formatter to pretty-print the annotated class
@interface PrettyPrinter {
	Class<? extends Formatter> value();
}

interface Formatter {
}

@Author(@Name(first = "Joe", last = "Hacker"))
class BitTwiddle {
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

@Quality(Quality.Level.GOOD)
class Karma {
}

@interface Quality {
	enum Level {
		BAD, INDIFFERENT, GOOD
	}

	Level value();
}

@interface Foo2 {
	int value();
}