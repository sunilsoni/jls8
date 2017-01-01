package com.jls.chapter8.superinterfaces;

interface I<T> {
}

class B implements I<Integer> {
}

class C extends B implements I<String> {
}
