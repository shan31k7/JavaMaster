package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LearnCollectionMap {
	static Map<Integer, String> idName = new HashMap<Integer, String>();
	static Hashtable<String, String> priceDiscount = new Hashtable<String, String>();

	public static void main(String[] args) {
		idName.put(13333, "Johnson");
		idName.put(13333, "James"); // duplicate key
		idName.put(13334, "Nelson");
		idName.put(13336, "Simpson");
		idName.put(13337, "Robin");
		idName.put(13338, "Johnson");

		Set<Integer> keys = idName.keySet();

		for (Integer i : keys) {
			System.out.println(idName.get(i));
		}

	}

}
