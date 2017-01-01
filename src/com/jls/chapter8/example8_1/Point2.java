package com.jls.chapter8.example8_1;

//Example 8.1.4-3. Class Depends on Itself
class Point2 extends ColoredPoint2 { int x, y; }

class ColoredPoint2 extends HidingClassVariables2 { int color; }

//This program causes a compile-time error because class Point depends on itself.
