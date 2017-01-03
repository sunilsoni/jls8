package com.jls.chapter8.Examples8_4;

import java.io.IOException;
import java.io.OutputStream;

//Example 8.4.8.1-1. Overriding
public class Overriding {

	public static void main(String[] args) throws IOException {

		Point3 p = new SlowPoint();
		p.move(1, 2);
		System.out.print("\n");
		// ===========
		LineBufferOutput lbo = new LineBufferOutput(System.out);
		lbo.putstr("lbo\nlbo");
		System.out.print("print\n");
		lbo.putstr("\n");

	}
}

class Point3 {
	int x = 0, y = 0;

	void move(int dx, int dy) {
		System.out.println("Point3");
		x += dx;
		y += dy;
	}
}

class SlowPoint extends Point3 {
	int xLimit, yLimit;

	void move(int dx, int dy) {
		System.out.println("SlowPoint");
		super.move(limit(dx, xLimit), limit(dy, yLimit));
	}

	static int limit(int d, int limit) {
		return d > limit ? limit : d < -limit ? -limit : d;
	}
}

class BufferOutput {
	private OutputStream o;

	BufferOutput(OutputStream o) {
		this.o = o;
	}

	protected byte[] buf = new byte[512];
	protected int pos = 0;

	public void putchar(char c) throws IOException {
		if (pos == buf.length)
			flush();
		buf[pos++] = (byte) c;
	}

	public void putstr(String s) throws IOException {
		for (int i = 0; i < s.length(); i++)
			putchar(s.charAt(i));
	}

	public void flush() throws IOException {
		o.write(buf, 0, pos);
		pos = 0;
	}
}

class LineBufferOutput extends BufferOutput {
	LineBufferOutput(OutputStream o) {
		super(o);
	}

	public void putchar(char c) throws IOException {
		super.putchar(c);
		if (c == '\n')
			flush();
	}
}