package com.jls.chapter8.inner;

//Example 8.1.2-2. Nested Generic Classes
class Seq<T> {
	T head;
	Seq<T> tail;

	Seq() {
		this(null, null);
	}

	Seq(T head, Seq<T> tail) {
		this.head = head;
		this.tail = tail;
	}

	boolean isEmpty() {
		return tail == null;
	}

	class Zipper<S> {
		Seq<Pair<T, S>> zip(Seq<S> that) {
			if (isEmpty() || that.isEmpty()) {
				return new Seq<Pair<T, S>>();
			} else {
				Seq<T>.Zipper<S> tailZipper = tail.new Zipper<S>();
				return new Seq<Pair<T, S>>(new Pair<T, S>(head, that.head), tailZipper.zip(that.tail));
			}
		}
	}
}

class Pair<T, S> {
	T fst;
	S snd;

	Pair(T f, S s) {
		fst = f;
		snd = s;
	}
}


