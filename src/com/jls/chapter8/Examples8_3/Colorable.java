package com.jls.chapter8.Examples8_3;

//Example 8.3-2. Re-inheritance of Fields
interface Colorable {
	int RED = 0xff0000, GREEN = 0x00ff00, BLUE = 0x0000ff;
}

interface Paintable extends Colorable {
	int MATTE = 0, GLOSSY = 1;
}

class Point3 {
	int x, y;
}

class ColoredPoint3 extends HidingInstanceVariables implements Colorable {
}

class PaintedPoint3 extends ColoredPoint3 implements Paintable {
	int p = RED;
}
