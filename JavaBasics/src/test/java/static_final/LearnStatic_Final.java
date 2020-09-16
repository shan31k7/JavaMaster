package static_final;

import static java.lang.Math.random;
import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * static 	- class level, common for all Objects, 
 * 			- access using ClassName/Reference
 * 			- used in variables, methods, blocks, imports, interface, inner class.
 * 
 * final 	- constant, not able to modify,
 * 			- used in variables, methods, class.
 */

public class LearnStatic_Final {

	static String nearestStar = "Sun";
	static String nearestSatellite = "Moon"; // Objects can modify the static variables

	// static method
	static public void howToWelcome() { 		// common behaviour for all objects
		System.out.println("Stand up and receive your guests");
		System.out.println("Random" + random());
	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	static { // initialiser
		System.out.println("I am the first one to be executed");
		// static varaiables

	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	public class innerClass1 { // instance level - one copy in each Object
		String name1 = "New";
		int age1 = 5;
	}

	public static class innerClass2 { // class level - single copy common for all objects
		String name2 = "New 2";
		int age2 = 5;
	}

	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

	final float PI = 3.14f; // accepted truth

	final public void greetingsMessage() { // cannot be overridden
		System.out.println("Namaskar !!!");
		// PI=4;
	}
}
