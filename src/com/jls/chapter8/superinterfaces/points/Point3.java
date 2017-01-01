package com.jls.chapter8.superinterfaces.points;

//Example 8.2-4. Inheritance of private Class Members
class Point3 {
	int x, y;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
		totalMoves++;
	}

	private static int totalMoves;

	void printMoves() {
		System.out.println(totalMoves);
	}
}

class Point33d extends Point3 {
	int z;

	void move(int dx, int dy, int dz) {
		super.move(dx, dy);
		z += dz;
		totalMoves++; // error
	}
}
