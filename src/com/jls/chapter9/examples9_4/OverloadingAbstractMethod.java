package com.jls.chapter9.examples9_4;

//Example 9.4.2-1. Overloading an abstract Method Declaration
public class OverloadingAbstractMethod implements RealPointInterface {
	public static void main(String[] args) {
		OverloadingAbstractMethod call = new OverloadingAbstractMethod();
		call.move(1, 1);
		call.move(1f, 1f);
		call.move(1d, 1d);
	}

	@Override
	public void move(int dx, int dy) {
		System.out.println("move int param");

	}

	@Override
	public void move(float dx, float dy) {
		System.out.println("move float param");

	}

	@Override
	public void move(double dx, double dy) {
		System.out.println("move  double param");

	}
}

interface PointInterface {
	void move(int dx, int dy);
}

interface RealPointInterface extends PointInterface {
	void move(float dx, float dy);

	void move(double dx, double dy);
}