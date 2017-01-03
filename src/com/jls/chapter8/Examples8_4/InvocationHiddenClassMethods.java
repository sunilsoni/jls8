package com.jls.chapter8.Examples8_4;

//Example 8.4.8.2-1. Invocation of Hidden Class Methods
public class InvocationHiddenClassMethods {
	public static void main(String[] args) {
		Super s = new Sub();
		System.out.println(s.greeting() + ", " + s.name());// Goodnight, Dick
		System.out.println(Sub.greeting() + ", " + s.name());// Hello, Dick
		
		System.out.print("\n");
		Super s1 = new Super();
		System.out.println(s1.greeting() + ", " + s1.name());//Goodnight, Richard
	}

}

class Super {
	static String greeting() {
		return "Goodnight";
	}

	String name() {
		return "Richard";
	}
}

class Sub extends Super {
	static String greeting() {
		return "Hello";
	}

	String name() {
		return "Dick";
	}
}
