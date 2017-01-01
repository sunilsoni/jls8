package com.jls.chapter9.examples9_3;

//Example 9.3-1. Ambiguous Inherited Fields
interface BaseColors {
	int RED = 1, GREEN = 2, BLUE = 4;
}

interface RainbowColors extends BaseColors {
	int YELLOW = 3, ORANGE = 5, INDIGO = 6, VIOLET = 7;
}

interface PrintColors extends BaseColors {
	int YELLOW = 8, CYAN = 16, MAGENTA = 32;
}

interface LotsOfColors extends RainbowColors, PrintColors {
	int FUCHSIA = 17, VERMILION = 43, CHARTREUSE = RED + 90;
}

class AmbiguousInheritedFields implements LotsOfColors{
	
	public static void main(String[] args) {
		System.out.println("RED-->"+RED);
		System.out.println("GREEN-->"+GREEN);
//		System.out.println("YELLOW-->"+YELLOW);//Error:The field YELLOW is ambiguous
		System.out.println("ORANGE-->"+ORANGE);
		System.out.println("INDIGO-->"+INDIGO);
		System.out.println("VIOLET-->"+VIOLET);
		
		System.out.println("CYAN-->"+CYAN);
		System.out.println("MAGENTA-->"+MAGENTA);
		System.out.println("FUCHSIA-->"+FUCHSIA);
		System.out.println("VERMILION-->"+VERMILION);
		System.out.println("CHARTREUSE-->"+CHARTREUSE);
		
	}
}
