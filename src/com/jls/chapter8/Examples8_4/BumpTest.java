package com.jls.chapter8.Examples8_4;
class BumpTest {
	int count;

	void bump() {
		synchronized (this) {
			count++;
		}
	}

	static int classCount;

	static void classBump() {
		try {
			synchronized (Class.forName("BumpTest")) {
				classCount++;
			}
		} catch (ClassNotFoundException e) {
		}
	}
}