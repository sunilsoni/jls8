package com.jls.chapter8;

//Example 8.1.3-1. Inner Class Declarations and Static Members
class HasStatic {
	static int j = 100;
}

class Outer {
	class Inner extends HasStatic {
		static final int x = 3; // OK: constant variable
		static int y = 4; // Compile-time error: an inner class
	}

	static class NestedButNotInner {
		static int z = 5; // OK: not an inner class
	}

	interface NeverInner {
	} // Interfaces are never inner
}
