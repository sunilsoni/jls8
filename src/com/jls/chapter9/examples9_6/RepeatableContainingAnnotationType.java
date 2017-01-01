package com.jls.chapter9.examples9_6;

import java.lang.annotation.Repeatable;

//Example 9.6.3-3. A Repeatable Containing Annotation Type
public class RepeatableContainingAnnotationType {
	public static void main(String[] args) {
		System.out.println();
	}
}

// Foo2: Repeatable annotation type
@Repeatable(Foo2Container.class)
@interface Foo2 {
	int value();
}

// Foo2Container: Containing annotation type of Foo2
// Also a repeatable annotation type itself
@Repeatable(FooContainerContainer.class)
@interface Foo2Container {
	Foo2[] value();
}

// Foo2ContainerContainer: Containing annotation type of Foo2Container
@interface FooContainerContainer {
	Foo2Container[] value();
}

@Foo2Container({ @Foo2(2) })
class A {
}