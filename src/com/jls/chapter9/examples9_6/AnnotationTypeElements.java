package com.jls.chapter9.examples9_6;

//9.6.1 Annotation Type Elements
public class AnnotationTypeElements {
	public static void main(String[] args) {

	}
}

@interface MarkerAnnotationType {

}

@interface SingleElementAnnotationType {
	int i = 1;
}

@interface Verboten {
	String[][] value();
}

@interface SelfRef {
	SelfRef value();
}

@interface Ping {
	Pong value();// Cycle detected: a cycle exists between annotation attributes
					// of Ping and Pong
}

@interface Pong {
	Ping value();// Cycle detected: a cycle exists between annotation attributes
					// of Pong and Ping
}