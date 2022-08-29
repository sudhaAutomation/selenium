package Collecctions;

import java.util.HashSet;

public class duplicateElemets {

	public static void main(String[] args) {
		// 2 for loops we have to use ,so we call it is O(n2)
		String s[] = { "java", "Testing", "python", "java", "python" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("duplicate elemts in the array is " + s[i]);
				}
			}

		}

		HashSet<String> hash = new HashSet<String>();
		for (String str : s) {
			if (hash.add(str) == false) {
				System.out.println("duplicate eleemnts in the array is " + str);
			}

		}
		System.out.println(hash);
	}

}
