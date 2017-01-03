package com.jls.chapter8.Examples8_4;

import java.util.Collection;
import java.util.List;

//Example 8.4.8.3-2. Unchecked Warning from Return Type
public class UncheckedWarningReturnType {

}

class StringSorter {
	// turns a collection of strings into a sorted list
	List toList(Collection c) {
		return null;
	}
}

class Overrider2 extends StringSorter {
	List toList(Collection c) {
		return null;
	}
}

class StringSorter1 {
	// turns a collection of strings into a sorted list
	List<String> toList(Collection<String> c) {
		return null;
	}
}