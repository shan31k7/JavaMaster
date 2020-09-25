package c_static_final;

import static java.lang.Math.random;

/*
 * static 	- class level, common for all Objects, 
 * 			- access using ClassName/Reference
 * 			- used in variables, methods, blocks, imports, interface, inner class.
 * 
 * final 	- constant, not able to modify,
 * 			- used in variables, methods, class.
 */

public class LearnStatic_Final { // outer class

	static String nearestStar = "Sun";
	static String nearestSatellite = "Moon"; // Objects can modify the static variables

	// static method
	static public void howToWelcome() { // common behaviour for all objects
		System.out.println("Stand up and receive your guests");
		System.out.println("Random" + random());
	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	static { // initialiser
		System.out.println("I am the first one to be executed");
		// static varaiables

	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	public class InnerClass1 { // instance class - one copy in each Object of Outerclass
		String name1 = "New";
		int age1 = 5;

		public void innermethod1() {
			System.out.println("innermethod1");
		}
	}

	public static class InnerClass2 { // static inner class - single copy, common for all objects
		String name2 = "New 2";
		int age2 = 5;

		public static void innermethod2() {
			System.out.println("innermethod2");
		}

		public void innermethod3() {
			System.out.println("innermethod2");
		}
	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	final float PI = 3.14f; // accepted truth

	final public void greetingsMessage() { // cannot be overridden
		System.out.println("Namaskar !!!");
		// PI=4;
	}
}
