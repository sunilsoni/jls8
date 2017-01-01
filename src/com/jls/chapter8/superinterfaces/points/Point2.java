package com.jls.chapter8.superinterfaces.points;

//Example 8.2-3. Inheritance of public and protected Class Members
public class Point2 {
	public int x, y;
	protected int useCount = 0;
	static protected int totalUseCount = 0;

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
		useCount++;
		totalUseCount++;
	}
}

class Test extends Point2 {
	public void moveBack(int dx, int dy) {
		x -= dx;
		y -= dy;
		useCount++;
		totalUseCount++;
	}
}