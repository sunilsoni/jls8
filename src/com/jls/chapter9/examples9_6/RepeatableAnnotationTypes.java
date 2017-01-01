package com.jls.chapter9.examples9_6;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

//Example 9.6.3-1. Ill-formed Containing Annotation Type
public class RepeatableAnnotationTypes {
	public static void main(String[] args) {
		System.out.println();
	}
}

@Repeatable(FooContainer.class)
@interface Foo {
}

// Invalid type Object[] for the annotation attribute FooContainer.value; only
// primitive type, String, Class, annotation, enumeration are permitted or
// 1-dimensional arrays thereof

/*
 * @interface FooContainer { Object[] value(); }
 */

@Target(ElementType.TYPE)
@Repeatable(Foo1Container.class)
@interface Foo1 {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@Interface Foo1Container {
	Foo1[] value();
}

@Foo1
@Foo1
@interface X {
}