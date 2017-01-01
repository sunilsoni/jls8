package com.jls.chapter8.Examples8_3;

//Example 8.3.1.1-3. Hiding of Instance Variables
class HidingInstanceVariables {
	int x = 2;
}

class Test6 extends HidingInstanceVariables {
	double x = 4.7;

	void printBoth() {
		System.out.println(x + " " + super.x);
	}

	public static void main(String[] args) {
		Test6 sample = new Test6();
		sample.printBoth();
		System.out.println(sample.x + " " + ((HidingInstanceVariables) sample).x);
	}
}
