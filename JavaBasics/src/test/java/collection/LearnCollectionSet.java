package collection;

import java.util.Set;
import java.util.TreeSet;

public class LearnCollectionSet {
	//static Set<String> names = new HashSet<String>();
	static Set<String> names = new TreeSet<String>();

	public static void main(String[] args) {
		names.add("Vanitha");
		names.add("victor");
		names.add("Ram");
		names.add("victor");
		names.add("Vanitha");
		//names.add(null);

		for (String string : names) {
			System.out.println(string);
		}
	}

}
