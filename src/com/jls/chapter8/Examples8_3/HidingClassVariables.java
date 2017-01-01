package com.jls.chapter8.Examples8_3;

//Example 8.3.1.1-2. Hiding of Class Variables
class HidingClassVariables {
	static int x = 2;
}

class Test4 extends HidingClassVariables {
	static double x = 4.7;

	public static void main(String[] args) {
		new Test4().printX();
	}

	void printX() {
		System.out.println(x + " " + super.x);//4.7 2
	}
}
