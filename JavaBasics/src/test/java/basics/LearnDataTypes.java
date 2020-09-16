package basics;

import org.testng.annotations.Test;

public class LearnDataTypes {
	@Test
	public void learnPrimitiveDataTypes() {
		byte b = 0; // minimum -128 and maximum of 127
		short s = 0; // minimum -32,768 and maximum 32,767
		int i = 9; // minimum -2^31 and a maximum value of 2^31-1
		long l = 34324324423l; // minimum -2^63 and a maximum value of 2^63-1
		float f = 334324.3434f; // Same size of an int
		double d = 343432.343432; // Same capacity of a long
		char c = 'P'; // minimum '\u0000' (or 0) and a maximum '\uffff'
		boolean bool = false; // true or false

		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("long " + l);
		System.out.println("float " + f);
		System.out.println("double " + d);
		System.out.println("char " + c);
		System.out.println("bool " + bool);

	}

	@Test
	public void learnWrapperDataTypes() {
		Byte b = 0; // minimum -128 and maximum of 127
		Short s = 0; // minimum -32,768 and maximum 32,767
		Integer i = 65000; // minimum -2^31 and a maximum value of 2^31-1
		Long l = 3432432432432423l; // minimum -2^63 and a maximum value of 2^63-1
		Float f = 334324.3434f; // Same size of an int
		Double d = 343432.343432; // Same capacity of a long
		Character c = 'P'; // minimum '\u0000' (or 0) and a maximum '\uffff'
		Boolean bool = true; // true or false

		System.out.println("Byte " + b.MAX_VALUE);
		System.out.println("Short " + s);
		System.out.println("Integer " + i);
		System.out.println("Long " + l);
		System.out.println("Float " + f);
		System.out.println("Double " + d);
		System.out.println("Character " + c);
		System.out.println("Boolean " + bool);

		int a = 5;
		Integer A = 5;

		A = a; // Auto boxing
		a = A; // Unboxing

		String number1 = "555";
		String number2 = "111";
		int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
		System.out.println("Sum: " + sum);

		// String.valueOf(3400);

	}
}
