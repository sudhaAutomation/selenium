package Exceptions;
public class trycatch{
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(10 / 10);// 1
		System.out.println("******");

		int a[] = { 12, 20, 40, 50 };// size of this array is 4
		System.out.println(a[3]);
		System.out.println(a.length);// 4

		try {// it will throws the exception if the statement in side the try block contain
				// any logical error
			//System.out.println("a[] holds the is " + a[8]);// ArrayIndexOutofBoundsException
			System.out.println("a[] holds the is " + a[2]);// ArrayIndexOutofBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {// catch block will catch the exception which is thrown by the try
			// block
			System.out.println("my error for a[5] is bcz of value is] " + e.getMessage());
		}
		try {// it will throws the exception if the statement in side the try block contain
				// any logical error
			//System.out.println("10/0 is not divided bcz error is " + 10 / 0);
			System.out.println("10/5 is " + 10 / 5); // infinte......ArthematicException

		} catch (ArithmeticException k) {

			System.out.println(" 10/5 contains the error is  " + k.getMessage());
		} finally {//
			System.out.println(" close the program aftr execution ");
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
// 1.Try-catch block
// try block
//2. throw keyword.......
//  throwable
// Exception: is the super class of all the exceptions in the java
// we are having some predefined exceptions classes
// ArrayIndexOutofBoundsException...sub class in the Exception handing
// ArthematicException
// NullPointerException
