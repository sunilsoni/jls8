package com.jls.chapter9_3;

//Example 9.3.1-1. Forward Reference to a Field
interface ForwardReferenceField {
	float f = j;//Cannot reference a field before it is defined
	int j = 1;
	int k = k + 1;//Cannot reference a field before it is defined
}