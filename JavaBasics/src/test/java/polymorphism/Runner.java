package polymorphism;

public class Runner {
	public static void main(String[] args) {
		// Parent class reference and Parent class Object
		System.out.println("Parent class reference = Parent class Object");
		OverLoading OL = new OverLoading();
		OL.calculate("new", "New");

		// Child class reference and child class object
		System.out.println("\nChild class reference = child class object");
		Overriding OR = new Overriding();
		OR.calculate("new", "New");

		// Parent class reference and child class Object
		System.out.println("\nParent class reference = child class Object");
		OverLoading OL1 = new Overriding();
		OL1.calculate("new", "New");
	}
}