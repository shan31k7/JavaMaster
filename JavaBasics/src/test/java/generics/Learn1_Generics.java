package generics;

import java.util.ArrayList;

//most of the runtime problems results of invalid dataType
	// short - Long -

// Create custom class with generics
// Create Objects for the class
// extends, super keywords at class level and method level
// Strictly typed
// Price - Number

class Currency<T extends Number> {
	T value;

	public void printDataType() {
		System.out.println("Inside Currency class");
		System.out.println(value.getClass().getName());
	}

	public void acceptMoney(T t) {
		System.out.println(t);
	}

	public void getPrice(ArrayList<? extends Integer> t) {
		// t can be Integer or subclass of Integer
	}

}

public class Learn1_Generics {
	public static void main(String[] args) {
		// can be applied only for Wrapper class
		Currency<Float> currency = new Currency<Float>();
		currency.value = 500.0f;
		currency.printDataType();

	}

}
