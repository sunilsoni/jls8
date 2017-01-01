package com.jls.chapter8.example8_1;

//Example 8.1.4-2. Superclasses and Subclasses
class Point1 { int x, y; }
class ColoredPoint1 extends Point1 { int color; }

final class Colored3dPoint1 extends ColoredPoint1 { int z; }
