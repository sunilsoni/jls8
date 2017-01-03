package com.jls.chapter8.Examples8_4;

//Example 8.4.3.6-1. synchronized Monitors
public class SynchronizedMethods {
	int count;

	synchronized void bump() {
		count++;
	}

	static int classCount;

	static synchronized void classBump() {
		classCount++;
	}
}

