package polymorphism;

public class Overriding extends OverLoading {

	// Parent class method overridden
	public char calculate(String text1, String text2) {
		System.out.println("Child class implementation");
		return text2.charAt(0);
	}
}