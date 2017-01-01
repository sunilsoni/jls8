package com.jls.chapter8.superinterfaces;

//Example 8.1.5-3. Implementing Methods of a Superinterface
interface Fish {
	int getNumberOfScales();
}

interface Piano {
	int getNumberOfScales();
}

class Tuna implements Fish, Piano {
	// You can tune a piano, but can you tuna fish?
	public int getNumberOfScales() {
		return 91;
	}
}
