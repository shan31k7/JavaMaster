package h_generics;

import java.util.ArrayList;

public class Learn2_CollectionGenerics {
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		array.add(33);
		array.add(3);
		array.add(45);
		//array.add("hello");
		//array.add(true);
		//array.add(99.999f);

		System.out.println("Given values: " + array);

		System.out.println("Remove value at Index 1");
		array.remove(1);
		System.out.println("Current values: " + array);

		System.out.println("Remove value at Index 1");
		array.remove(1);
		System.out.println("Current values: " + array);

		multiplyBy2(array);
	}

	public static void multiplyBy2(ArrayList arr) {
		for (Object value : arr) {
			System.out.print((Integer) value * 2 + ", ");
		}
	}

}
