package static_final;

import static java.lang.Math.random;
import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * Static 	- class level, common for all Objects, access using ClassName/Reference
 * 			- used in variables, methods, blocks, imports, inner class.
 * 
 * final 	- constant, not able to modify, 
 * 			- used in variables, methods, class.
 */

public final class LearnStatic_Final {

	final float PI = 3.14f;   // accepted truth
	
	static String nearestStar = "Sun";
	static String nearestSatellite = "Moon";		// access and modify them

	final public void greetingsMessage() {		// cannot be overridden
		System.out.println("Namaskar !!!");
		//PI=4;
	}
	
	// static method
	static public void howToWelcome() {				// common behaviour for all objects
		System.out.println("Stand up and receive your guests");
		
		System.out.println("Random" + random());
	}

	public class innerClass1 {			// copy exists in each Object
		String name1 = "New";
		int age1 = 5;
	}

	public static class innerClass2 {		// common for all objects
		String name2 = "New 2";
		int age2 = 5;
	}

	static {					// initialiser
		System.out.println("I am the first one to be executed");
		// static varaiables

	}
}
