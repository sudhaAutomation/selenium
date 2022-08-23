package constructor;

public class Swappingnumbers {// swapping is aprocess to interchange the values from one varible to an other
								// variables

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;// third varible
		System.out.println("before swapping");
		System.out.println("a value is " + a);
		System.out.println("b value is " + b);
		// c = a;// 10
		// a = b;// 20
		// b = c;// 10
		// System.out.println("after swapping");
		// System.out.println("a value is " + a);
		// System.out.println("b value is " + b);

		// without third variable

		// a = a + b;// 30
		// b = a - b;// 30-20=10
		// a = a - b;// 20
		// System.out.println("after swapping");
		// System.out.println("a value is " + a);
		// System.out.println("b value is " + b);

		// without third varible and without +,-
		// a = a * b;// 200
		// b = a / b;// 200/20=10
		// a = a / b;// 200/10=20
		// System.out.println("after swapping");
		// System.out.println("a value is " + a);
		// System.out.println("b value is " + b);

		// XOR:int will be changed to Binary values and later swaps the values
		a = a ^ b;// 1010
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swapping");
		System.out.println("a value is " + a);
		System.out.println("b value is " + b);

	}

}
