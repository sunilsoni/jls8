package com.jls.chapter8.Examples8_4;

//Example 8.4.3.1-1. Abstract/Abstract Method Overriding
public class AbstractMethodOverriding {

}

class BufferEmpty extends Exception {
	BufferEmpty() {
		super();
	}

	BufferEmpty(String s) {
		super(s);
	}
}

class BufferError extends Exception {
	BufferError() {
		super();
	}

	BufferError(String s) {
		super(s);
	}
}

interface Buffer {
	char get() throws BufferEmpty, BufferError;
}

abstract class InfiniteBuffer implements Buffer {
	public abstract char get() throws BufferError;
}