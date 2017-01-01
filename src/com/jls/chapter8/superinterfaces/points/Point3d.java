package com.jls.chapter8.superinterfaces.points;

public class Point3d extends Point {
	int z;

	public void move(int dx, int dy, int dz) {
		x += dx;
		y += dy;
		z += dz;
	}
}