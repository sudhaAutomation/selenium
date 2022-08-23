package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(100);
		array.add(200);
		array.add(300);
		array.add(400);
		array.add(500);
		array.add(400);
		array.add(500);
		array.add(400);
		array.add(500);
		array.add(400);
		array.add(500);
		System.out.println(array.size());
		//array.remove(3);
		System.out.println(array.contains(300));
		System.out.println(array);
		Iterator<Integer> it = array.iterator();
		System.out.println(it.hasNext());
		System.out.println("array by while loop");
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("array by for each loop");
		for (Integer ar : array) {
			System.out.println(ar);

		}
	}

}
