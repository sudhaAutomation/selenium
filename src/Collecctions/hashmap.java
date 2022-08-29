package Collecctions;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// not allowed the duplicate elements..unique elemets
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(500);
		array.add(600);
		array.add(400);
		array.add(300);
		System.out.println(array);
		map.put(1, "admin@admin.com");
		map.put(2, "admin1@admin.com");
		map.put(3, "admin@gmail.com");
		map.put(3, "admin@gmail.com");
		map.put(3, "admin@gmail.com");
		map.put(3, "admin@gmail.com");
		map.put(3, "admin@gmail.com");

		System.out.println(map);
		System.out.println(map.get(2));
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "swhizz.com");
		map2.put(2, "Swhizz@admin.com");
		map2.put(3, "test@gmail.com");

		System.out.println(map2);
		map2.putAll(map);//

		System.out.println(map2);

	}

}
