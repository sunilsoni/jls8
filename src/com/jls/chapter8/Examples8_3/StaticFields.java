package com.jls.chapter8.Examples8_3;

//Example 8.3.1.1-1. static Fields
class StaticFields {
	int x, y, useCount;

	StaticFields(int x, int y) {
		this.x = x;
		this.y = y;
	}

	static final StaticFields origin = new StaticFields(0, 0);
}

class Test2 {
	public static void main(String[] args) {
		StaticFields p = new StaticFields(1, 1);
		StaticFields q = new StaticFields(2, 2);
		p.x = 3;
		p.y = 3;
		p.useCount++;
		p.origin.useCount++;
		System.out.println("(" + q.x + "," + q.y + ")");
		System.out.println(q.useCount);
		System.out.println(q.origin == StaticFields.origin);
		System.out.println(q.origin.useCount);
	}
}
