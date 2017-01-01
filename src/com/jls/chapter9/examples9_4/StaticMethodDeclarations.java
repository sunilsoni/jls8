package com.jls.chapter9.examples9_4;

//9.4 Method Declarations
public interface StaticMethodDeclarations {
	public static int VAR1 = 1;
	// public static int bar();//This method requires a body instead of a
	// semicolon

	static int staticMethod() {
		// static final int VAR2 = 1;//Illegal modifier for parameter VAR2; only
		// final is permitted
		System.out.println("Static interface method...");
		return 0;
	}

	strictfp static int strictfpStaticMethod() {
		System.out.println("strictfpStaticMethod interface method...");
		return 0;
	}

	abstract int abstractMethod();

	// strictfp int strictfpMethod();// strictfp is not permitted for abstract
	// interface method strictfpMethod
}

strictfp interface StrictfpInterface {
	public static int VAR1 = 1;
}

strictfp class StaticMethodDeclarationsTest implements StaticMethodDeclarations, StrictfpInterface {

	public static void main(String[] args) {
		StaticMethodDeclarations.staticMethod();
		staticMethod();
	}

	public static int staticMethod() {
		System.out.println("Static class  method...");
		return 0;
	}

	@Override
	public int abstractMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
}