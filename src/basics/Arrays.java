package basics;

public class Arrays {// array is an object to store the similar data types values in a same memory
						// location

	public static void main(String[] args) {
		// int i=10;
		// int i=20;
		int i[] = new int[5];// static array
		// specific data type array
		i[0] = 10;// 0th index memory location
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		// i[5]=60;
		// System.out.println(""+i[6]);//ArrayIndexOutOfBoundsException
		// System.out.println(""+i[2]);
		// System.out.println(""+i[1]);
		// System.out.println(""+i[3]);
		// System.out.println(""+i[4]);
		System.out.println(i.length);// 5
		for (int j = 0; j < i.length; j++) {// j++
			// j=j+1
			System.out.println(i[j]);
		}

		// double i[] = new int[5];
		// char i[] = new int[5];
		// String j[];
		// long f[];

	}

}
