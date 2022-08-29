package MyClasswork;

public class Array {// array is a collection of similar type of elements which has contiguous memory
					// location.

	// Java array is an object which contains elements of a similar data type.
	// Additionally, The elements of an array are stored in a contiguous memory
	// location.

	public static void main(String[] args) {
		int l[] = { 12, 34, 56, 78 };
		System.out.println(l[3]);
		System.out.println(l[9]);
		for (int k = 0; k < l.length; k++) {
			System.out.println(l[k]);
		}
		// int i= 10;
		// i=20;
		// Array:stroring the the values which are belongs to same data type
		// int data types
		int i[] = new int[6];// static array....size of the array is fixed///over come this
								// ...Collections.......
		i[0] = 20;// in array the elsements storing will be start from 0 position;0,1,2,3,4
		i[1] = 30;
		i[2] = 40;
		i[3] = 50;
		i[4] = 60;
		i[5] = 70;// Jvm throws an exception "Array index out of the bounds exception"
		System.out.println(i[4]);
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("*******");// curser will move on to the nect line to print the output
		System.out.print("&&&&&&&");// cursur will continue in same line
		// string
		String s[] = new String[3];
		s[0] = "Sudha";

		s[1] = "Swathi";
		s[2] = "Praveen";
		System.out.println(s[0]);
		System.out.println(s.length);
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		System.out.println("*******");
		// char,boolean,double

		// customer....name,pho.no.address,char

		// Object .....class
		Object cust[] = new Object[5];
		cust[0] = "Raju";
		cust[1] = 899998;
		cust[2] = 'A';
		cust[3] = 12.34;
		cust[4] = true;
		for (int j = 0; j < cust.length; j++) {
			System.out.println(cust[j]);
		}

	}

}
