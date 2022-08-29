package Collecctions;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Testing");
		list.add("Selenium");
		list.add("qtp");
		list.add("UFT");
		System.out.println(list);
		System.out.println(list.remove());
		System.out.println(list);

		System.out.println(list);
		LinkedList<String> list2 = new LinkedList<String>();

		list2.add("course");
		list2.add("mulesoft");
		list2.add("saleforce");
		list2.add("testing");

		System.out.println(list2.addAll(list));
		System.out.println(list2);
		// System.out.println(list2.removeAll(list));//true//list2 elements will be
		// deleted which are available in the list
		// System.out.println(list2);//
		// System.out.println(list2.removeAll(list));//false
		System.out.println(list2.retainAll(list));// true
		System.out.println(list2);// list elements available
	}

}
