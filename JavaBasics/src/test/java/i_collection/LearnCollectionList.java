package i_collection;

import java.util.ArrayList;
import java.util.List;
// Data structure - 
// List - duplicate, null, follows insertion order, indexing
// Set - unique, but not follow any order
// Map - <key, value> - key is unique, value can duplicate and null
// Queue - FIFO, LIFO

// read, update, - ArrayList - 
// insert, delete - LinkedList
public class LearnCollectionList {
	static List<Boolean> boolArray = new ArrayList<Boolean>();

	public static void main(String[] args) {
		boolArray.add(true);
		boolArray.add(false);
		boolArray.add(true);
		boolArray.add(false);
		System.out.println("Given values: " + boolArray);

		System.out.println("First value: " + boolArray.get(0));
		
		boolArray.set(2, false);
		System.out.println("Given values: " + boolArray);

		boolArray.remove(1);
		System.out.println("Given values: " + boolArray);
		
		for(Boolean bool:boolArray)
		{
			System.out.println(bool);
		}
		
		boolArray.forEach((input) -> System.out.println(input));

	}
	// LinkedList - search operation is costly,
	// ArrayList - search operation - insertion order, insert or remove

}
