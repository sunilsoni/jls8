package com.jls.chapter8.Examples8_3;

//Example 8.3-1. Multiply Inherited Fields
interface Color {
	int RED = 0, GREEN = 1, BLUE = 2;
}

interface TrafficLight {
	int RED = 0, YELLOW = 1, GREEN = 2;
}

class Test3 implements Color, TrafficLight {
	public static void main(String[] args) {
		System.out.println(GREEN); // compile-time error: The field GREEN is ambiguous
		System.out.println(RED); // compile-time error
	}
}