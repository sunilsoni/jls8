package com.jls.chapter8.Examples8_4;

import java.io.FileNotFoundException;

//Example 8.4.6-1. Type Variables as Thrown Exception Types
public class TypeVariablesThrownExceptionTypes {
	public static void main(String[] args) {
		try {
			AccessController.doPrivileged(new PrivilegedExceptionAction<FileNotFoundException>() {
				public void run() throws FileNotFoundException {
					// ... delete a file ...
				}
			});
		} catch (FileNotFoundException f) {
			/* Do something */ }
	}
}

interface PrivilegedExceptionAction<E extends Exception> {
	void run() throws E;
}

class AccessController {
	public static <E extends Exception> Object doPrivileged(PrivilegedExceptionAction<E> action) throws E {
		action.run();
		return "success";
	}
}