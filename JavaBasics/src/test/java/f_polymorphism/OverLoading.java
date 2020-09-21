package f_polymorphism;

public class OverLoading {
	// Overloading concept is used to define multiple implementations for a method.
	// Overloaded methods will have same method Signature
	// JVM uniquely identifies each overloaded method based on their arguments
	// arguments can different in data-type/number of arguments/order of arguments
	// return type does not make a difference

	public int calculate(int data) {
		return data * data;
	}

	
	  /*public String calculate(int value) // return type will not make any difference
	  { return "Hello"; }*/
	 

	public int calculate(String text) {
		return text.length();
	}

	public int calculate(double decimal) {
		return (int) decimal;
	}

	public int calculate(int a, int b) {
		return a + b;
	}

	public int calculate(String text, int b) {
		System.out.print("Method accepts String, int");
		return b;
	}

	public int calculate(int b, String text) {
		System.out.print("Method accepts int, String");
		return b;
	}
	
	// Parent class method
	public char calculate(String text1, String text2) {
		System.out.println("Parent class implementation");
		return text1.charAt(0);
	}
}