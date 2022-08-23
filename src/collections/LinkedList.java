package collections;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedList {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("First name", "Swhizz");
		map.put("LastName", "Technologies");
		map.put("address", "madhapur");
		map.put("State", "Telangana");
		map.put("address", "madhapur");
		map.put("State", "Telangana");
		map.put("address", "madhapur");
		map.put("State", "Telangana");

		System.out.println(map);

		HashSet<String> hashset = new HashSet<String>();
		hashset.add("ramu");
		hashset.add("somu");
		hashset.add("seetha");
		hashset.add("lakshmi");
		hashset.add("seetha");
		hashset.add("lakshmi");
		System.out.println(hashset);
		
		for (String set : hashset) {
			System.out.println(set);
		}

	}

}
