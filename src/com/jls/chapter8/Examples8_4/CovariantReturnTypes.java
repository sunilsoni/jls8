package com.jls.chapter8.Examples8_4;

//Example 8.4.8.3-1. Covariant Return Types
public class CovariantReturnTypes {

}

class C implements Cloneable {
	C copy() throws CloneNotSupportedException {
		return (C) clone();
	}
}

class D extends C implements Cloneable {
	D copy() throws CloneNotSupportedException {
		return (D) clone();
	}
}