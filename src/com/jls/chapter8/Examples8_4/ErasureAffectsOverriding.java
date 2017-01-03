package com.jls.chapter8.Examples8_4;

//Example 8.4.8.3-4. Erasure Affects Overriding
public class ErasureAffectsOverriding {

}

class CC<T> {
	T id(T x) {
		return null;
	}
}

class DD extends CC<String> {
	Object id(Object x) {
		return null;
	}
}

class CCC<T> {
	T id(T x) {
	}
}

interface II<T> {
	T id(T x);
}

class DDD extends CCC<String> implements II<Integer> {
	public String id(String x) {
	}

	public Integer id(Integer x) {
	}
}