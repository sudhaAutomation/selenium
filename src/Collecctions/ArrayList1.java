package Collecctions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(100);
		array.add(200);
		array.add(400);
		array.add(100);
		array.add(500);
		array.add(200);
		Iterator<Integer>it=array.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(array);// [100, 200, 400, 100, 500, 200]
		array.remove(3);
		System.out.println(array);
		System.out.println(array.get(3));// 500
		
	}

}
