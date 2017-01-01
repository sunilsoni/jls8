package com.jls.chapter8;


//Page No: 263
public class ColoredPoint extends Point {

	static final int WHITE = 0, BLACK = 1;
	int color;

	ColoredPoint(int x, int y) {
		//this(x, y, color);//Error:Cannot refer to an instance field color while explicitly invoking a constructor
		this(x, y, WHITE);
	}

	ColoredPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

}
