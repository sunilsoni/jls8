package com.jls.chapter8.Examples8_4;

//Example 8.4.8.3-3. Incorrect Overriding because of throws
public class IncorrectOverridingBecauseThrows {

}

class BadPointException extends Exception {
	BadPointException() {
		super();
	}

	BadPointException(String s) {
		super(s);
	}
}

class Point4 {
	int x, y;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}

class CheckedPoint extends Point4 {
	
	//1
	/*void move(int dx, int dy) throws BadPointException {
		if ((x + dx) < 0 || (y + dy) < 0)
			throw new BadPointException();
		x += dx;
		y += dy;
	}*/
	
	//2
	void move(int dx, int dy) {
		if ((x + dx) < 0 || (y + dy) < 0)
			throw new BadPointException();
		x += dx;
		y += dy;
	}
}