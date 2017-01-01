package com.jls.chapter8.Examples8_3;

//Example 8.3-1. Multiply Inherited Fields
interface Frob {
	float v = 2.0f;
}

class SuperTest {
	int v = 3;
}

class Test extends SuperTest implements Frob {
	public static void main(String[] args) {
		new Test().printV();
	}

	void printV() {
		System.out.println(v);//Error:The field v is ambiguous
	}
}