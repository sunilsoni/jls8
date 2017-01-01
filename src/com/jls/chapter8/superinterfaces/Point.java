package com.jls.chapter8.superinterfaces;

//Example 8.2-1. Use of Class Members
class Point {
	int x, y;

	private Point() {
		reset();
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private void reset() {
		this.x = 0;
		this.y = 0;
	}
}

class ColoredPoint extends Point {
	int color;

	void clear() {
		reset();
	} // error
}

class Test {
	public static void main(String[] args) {
		ColoredPoint c = new ColoredPoint(0, 0); // error
		c.reset(); // error
	}
}

/*
 * This program causes four compile-time errors.
 * 
	One error occurs because ColoredPoint has no constructor declared with two int
	parameters, as requested by the use in main. This illustrates the fact that ColoredPoint
	does not inherit the constructors of its superclass Point.
	
	Another error occurs because ColoredPoint declares no constructors, and therefore a
	default constructor for it is implicitly declared (§8.8.9), and this default constructor is
	equivalent to: ColoredPoint() { super(); }
*/
