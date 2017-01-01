package com.jls.chapter9_4;

public interface StaticMethodDeclarations {

	// public static int bar();//This method requires a body instead of a
	// semicolon

	public static int staticMethod() {
		System.out.println("Static interface method...");
		return 0;
	}
}

class StaticMethodDeclarationsTest implements StaticMethodDeclarations {

	public static void main(String[] args) {
		StaticMethodDeclarations.staticMethod();
		staticMethod();
	}

	public static int staticMethod() {
		System.out.println("Static class  method...");
		return 0;
	}
}