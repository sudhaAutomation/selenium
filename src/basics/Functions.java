package basics;

public class Functions {// class is a block in the src code of java which contains some properties in
						// the form of methods and variables
	int i = 1000;
	int j = 2000;

	// No arguments no output
	public void sum() {
		int a = 2;
		int b = 3;
		System.out.println("sum of and ab is " + (a + b));// 5

	}

	// 1 argument no output
	public void sum(int k) {// void means returns nothing
		int a = 2;
		int b = 3;
		int c = b + k;
		System.out.println("k value is " + k);// 100
		System.out.println(" sum of b and k is " + c);// 103
		System.out.println("sum of and ab is " + (a + b));// 5
	}

	// no arguments some output
	public int sum1() {
		int a = 2;
		int b = 3;
		int c = b + a;
		System.out.println("sum of and ab is " + c);
		return c;
	}

	// with arguments with some output/with return type
	public String sum1(String s, String a) {
		String name = s + a;
		System.out.println("the name is " + name);
		return name;
	}

	public static void main(String[] args) {// method is block in which we can perfom some actions in the functions
		Functions swhizz = new Functions();// object
		swhizz.sum();
		swhizz.sum(100);
		swhizz.sum1();
		swhizz.sum1("Testing", "Course");
		System.out.println(swhizz.i);
		System.out.println(swhizz.j);
	}

}
