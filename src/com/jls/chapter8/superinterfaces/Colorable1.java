package com.jls.chapter8.superinterfaces;


/*Example 8.1.5-3. Implementing Methods of a Superinterface
 * This program causes a compile-time error, because ColoredPoint is not an abstract
  class but fails to provide an implementation of methods setColor and getColor of the
  interface Colorable.
 */
interface Colorable1 {
	void setColor(int color);

	int getColor();
}

class Point {
	int x, y;
};

class ColoredPoint extends Point implements Colorable1 {
	int color;
}
