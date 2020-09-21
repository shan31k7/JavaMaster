package h_generics;

import java.util.ArrayList;
// java is a strictly type language
// type means class, 
//most of the runtime problems results of invalid dataType
// short - Long -

// Create custom class with generics
// extends, super keywords at class level and method level
// Price - Number

class Currency<T extends Number> {
	T value;
	int PI=3;

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
		// generics can be applied only for Wrapper class
		//Currency<String> currency1 = new Currency<String>();
		//Currency<Boolean> currency2 = new Currency<Boolean>();
		//Currency<Character> currency3 = new Currency<Character>();
		Currency<Float> currency4 = new Currency<Float>();
		Currency<Double> currency5 = new Currency<Double>();
		Currency<Integer> currency6 = new Currency<Integer>();


	}

}
