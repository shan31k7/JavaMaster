package j_exceptions;

import java.util.Scanner;

public class Learn3_CustomException extends StringIndexOutOfBoundsException {

	Learn3_CustomException() {
		super(); // parent class constructor
	}
	
	// constructs is the object for the class along with new keyword
	// same name of the classname
	// initialize the instance variables
	// does not have return type
	// generally constructors are public
	// by default JVM define default constrcutor for all the classes
	// constructors can be overloaded

	Learn3_CustomException(String error) {
		super();

		System.out.println(error); // logic specific to your custom exception
	}

}