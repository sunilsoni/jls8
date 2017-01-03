package com.jls.chapter8.Examples8_4;

//8.4.3.3 final Methods
public class FinalMethods {
	public static void main(String[] args) {
		Point2[] p = new Point2[100];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point2();
			p[i].move(i, p.length - 1 - i);
		}

		for (int i = 0; i < p.length; i++) {
			p[i] = new Point2();
			Point2 pi = p[i];
			int j = p.length - 1 - i;
			pi.x += i;
			pi.y += j;
		}
	}
}

final class Point2 {
	int x, y;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
