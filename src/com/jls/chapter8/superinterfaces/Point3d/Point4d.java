package com.jls.chapter8.superinterfaces.Point3d;

import com.jls.chapter8.superinterfaces.points.Point3d;

//Example 8.2-2. Inheritance of Class Members with Package Access
class Point4d extends Point3d {
	int w;

	public void move(int dx, int dy, int dz, int dw) {
		x += dx;
		y += dy;
		z += dz;
		w += dw; // compile-time errors
	}
}

