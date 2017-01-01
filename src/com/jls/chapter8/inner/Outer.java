package com.jls.chapter8.inner;

//Example 8.1.3-2. Inner Class Declarations
class Outer {
	int i = 100;

	static void classMethod() {
		final int l = 200;
		class LocalInStaticContext {
			int k = i; // Compile-time error
			int m = l; // OK
		}
	}

	void foo() {
		class Local { // A local class
			int j = i;
		}
	}
}
