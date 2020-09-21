package i_collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnCollectionQueue {

	public static void main(String[] args) {

		// Queue<Float> queue = new HashQueue<Float>();

		PriorityQueue<String> names = new PriorityQueue<String>();
		names.add("vimal");
		names.add("raj");
		names.add("Rani");
		System.out.println(names.peek());

	}

}
