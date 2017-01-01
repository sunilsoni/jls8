package com.jls.chapter8.superinterfaces;

//Example 8.1.5-1. Illegal Superinterfaces
class Redundant implements java.lang.Cloneable, Cloneable {
	int x;
}


/*
This program results in a compile-time error because the names java.lang.Cloneable
and Cloneable refer to the same interface.
*/