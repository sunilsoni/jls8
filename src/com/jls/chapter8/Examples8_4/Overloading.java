package com.jls.chapter8.Examples8_4;

//Example 8.4.9-2. Overloading, Overriding, and Hiding
public class Overloading {

}

class PointOverloading {
	float x, y;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	void move(float dx, float dy) {
		x += dx;
		y += dy;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class Point5 {
	int x = 0, y = 0;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	int color;
}

class RealPoint extends Point5 {
	float x = 0.0f, y = 0.0f;

	void move(int dx, int dy) {
		move((float) dx, (float) dy);
	}

	void move(float dx, float dy) {
		x += dx;
		y += dy;
	}
}