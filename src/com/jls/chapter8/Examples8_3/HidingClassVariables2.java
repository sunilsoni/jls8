package com.jls.chapter8.Examples8_3;

//Example 8.3.1.1-2. Hiding of Class Variables
class HidingClassVariables2 {
	static int x = 2;
}

class Test5 extends HidingClassVariables2 {
	public static void main(String[] args) {
		new Test5().printX();
	}

	void printX() {
		System.out.println(x + " " + super.x);

	}
}