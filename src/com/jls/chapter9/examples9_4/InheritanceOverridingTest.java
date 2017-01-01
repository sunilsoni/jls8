package com.jls.chapter9.examples9_4;

//9.4.1 Inheritance and Overriding
public class InheritanceOverridingTest implements Bottom {

	public static void main(String[] args) {
		// System.out.println("name()--->"+super.name());//Cannot use super in a
		// static context
		
		
	}
}

interface Top {
	default String name() {
		return "unnamed";
	}
}

interface Left extends Top {
	default String name() {
		return getClass().getName();
	}
}

interface Right extends Top {
}

interface Bottom extends Left, Right {
}