package com.jls.chapter8.inner;

import com.jls.chapter8.inner.Seq.Zipper;

public class Test {

	public static void main(String[] args) {
		Seq<String> strs = new Seq<String>("a", new Seq<String>("b", new Seq<String>()));
		Seq<Number> nums = new Seq<Number>(new Integer(1), new Seq<Number>(new Double(1.5), new Seq<Number>()));
		Seq<String>.Zipper<Number> zipper = strs.new Zipper<Number>();
		Seq<Pair<String, Number>> COMBINED = zipper.zip(nums);
		System.out.println("End");
	}

}
