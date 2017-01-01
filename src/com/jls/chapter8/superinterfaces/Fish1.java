package com.jls.chapter8.superinterfaces;

interface Fish1 {
	int getNumberOfScales();
}

interface StringBass {
	double getNumberOfScales();
}

class Bass implements Fish1, StringBass {
	// This declaration cannot be correct,
	// no matter what type is used.
public ?? getNumberOfScales() { return 91; }
}
