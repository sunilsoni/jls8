package com.jls.chapter9.examples9_6;

import java.util.Collections;
import java.util.Comparator;

public class MethodOverriding extends Object implements ObjectInterface {
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();

		System.out.println("equals-->" + obj.equals(obj));

		System.out.println("toString-->" + obj.toString());
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Starting equals()-->" + obj.getClass());
		return (this == obj);
	}

	@Override
	public String toString() {
		System.out.println("Starting toString()-->" + this.getClass());
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}

interface ObjectInterface {

	public boolean equals(Object obj);

	public String toString();

	// public int hashCode();

	/*
	 * default int hashCode() { return 1;//Error: A default method cannot
	 * override a method from // java.lang.Object }
	 */

	/*
	 * default int notify() { return 1; }
	 */

	/*
	 * default int intDefault() { return 1; }
	 */

	// public int test();

}
