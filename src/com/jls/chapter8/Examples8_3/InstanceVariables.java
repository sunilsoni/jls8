package com.jls.chapter8.Examples8_3;

//Example 8.3.1.1-3. Hiding of Instance Variables
class InstanceVariables {
	static int x = 2;
}

class Test7 extends InstanceVariables {

	void printBoth() {
		System.out.println(x + " " + super.x);
	}

	public static void main(String[] args) {
		Test7 sample = new Test7();
		sample.printBoth();
		System.out.println(sample.x + " " + ((InstanceVariables) sample).x);
	}
}