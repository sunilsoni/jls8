package com.jls.chapter8.Examples8_3;

//Example 8.3-1. Multiply Inherited Fields
interface Frob2 {
	float v = 2.0f;
}

class SuperTest12 {
	int v = 3;
}

class Test1 extends SuperTest12 implements Frob2 {
	public static void main(String[] args) {
		new Test1().printV();
	}

	void printV() {
		System.out.println((super.v + Frob2.v) / 2);//2.5
	}
}
