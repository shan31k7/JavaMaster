package collection;

import java.util.ArrayList;
import java.util.List;
// Datastructure - 
// List - duplicate, null, maintains insertion order
// Set - unique, no order
// Map - <key, value> - key is unique, value can duplicate and null
// Queue - FIFO, LIFO

// read, update, - ArrayList - 
// insert, delete - LinkedList
public class LearnCollectionList {
	static ArrayList<Boolean> boolArray = new ArrayList<Boolean>();

	public static void main(String[] args) {
		boolArray.add(true);
		boolArray.add(false);
		boolArray.add(true);
		boolArray.add(false);

		System.out.println("Given values: " + boolArray);
	}
	
	// LinkedList - search operation is costly, 
	// ArrayList - search operation - insertion order, insert or remove

}
