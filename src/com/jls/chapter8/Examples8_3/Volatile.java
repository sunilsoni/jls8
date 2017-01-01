package com.jls.chapter8.Examples8_3;

//Example 8.3.1.4-1. volatile Fields
public class Volatile {

	static int i = 0, j = 0;

	static void one() {
		i++;
		j++;
	}

	static void two() {
		System.out.println("i=" + i + " j=" + j);
	}
	
	public static void main(String[] args) {
		one();
		two();
	}
}
