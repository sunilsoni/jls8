package com.jls.chapter8.example8_1;

//Example 8.1.1.1-1. Abstract Class Declaration
abstract class Point {
	int x = 1, y = 1;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
		alert();
	}

	abstract void alert();
}

abstract class ColoredPoint extends Point {
	int color;
}

class SimplePoint extends Point {
	void alert() {
	}
}
