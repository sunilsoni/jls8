package com.jls.chapter8.example8_1;

//Example 8.1.4-1. Direct Superclasses and Subclasses
class Point0 {
	int x, y;
}

final class ColoredPoint1 extends Point0 {
	int color;
}

class Colored3DPoint extends ColoredPoint1 {
	int z;
} // error
