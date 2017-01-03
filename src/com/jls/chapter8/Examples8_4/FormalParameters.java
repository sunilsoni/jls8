package com.jls.chapter8.Examples8_4;

public class FormalParameters {
	public static void main(String[] args) {
		System.out.println();
	}
}

class Test {
	Test(/* ?? ?? */) {
	}

	// No receiver parameter is permitted in the constructor of
	// a top level class, as there is no conceivable type or name.
	void m(Test this) {
	}

	// OK: receiver parameter in an instance method
	static void n(Test this) {
	}

	// Illegal: receiver parameter in a static method
	class A {
		A(Test Test.this) {
		}

		// OK: the receiver parameter represents the instance
		// of Test which immediately encloses the instance
		// of A being constructed.
		void m(A this) {
		}

		// OK: the receiver parameter represents the instance
		// of A for which A.m() is invoked.
		class B {
			B(Test.A A.this) {
			}

			// OK: the receiver parameter represents the instance
			// of A which immediately encloses the instance of B
			// being constructed.
			void m(Test.A.B this) {
			}
			// OK: the receiver parameter represents the instance
			// of B for which B.m() is invoked.
		}
	}
}