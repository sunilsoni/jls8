package com.jls.chapter8.example8_1;

interface Colorable {
	void setColor(int color);
}

abstract class Colored implements Colorable {
	public abstract int setColor(int color);
}
