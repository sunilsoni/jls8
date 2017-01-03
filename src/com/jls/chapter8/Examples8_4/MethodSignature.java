package com.jls.chapter8.Examples8_4;

import java.util.Collection;
import java.util.List;

//Example 8.4.2-1. Override-Equivalent Signatures
public class MethodSignature {
	int x, y;

	abstract void move(int dx, int dy);

	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}

class CollectionConverter {
	List toList(Collection c) {
		return null;
	}
}

class Overrider extends CollectionConverter {
	List toList(Collection c) {
		return null;
	}
}

class CollectionConverter1 {
	<T> List<T> toList(Collection<T> c) {
		return null;
	}
}