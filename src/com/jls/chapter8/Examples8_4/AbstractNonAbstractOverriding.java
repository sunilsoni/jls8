package com.jls.chapter8.Examples8_4;

//Example 8.4.3.1-2. Abstract/Non-Abstract Overriding
public class AbstractNonAbstractOverriding {

}

abstract class Point {
	int x, y;

	public abstract String toString();
}

class ColoredPoint extends Point {
	int color;

	public String toString() {
		return super.toString() + ": color " + color; // error: Cannot directly
														// invoke the abstract
														// method toString() for
														// the type Point
	}
}

abstract class Point1 {
	int x, y;

	public abstract String toString();

	protected String objString() {
		return super.toString();
	}
}

class ColoredPoint1 extends Point1 {
	int color;

	public String toString() {
		return objString() + ": color " + color; // correct
	}
}