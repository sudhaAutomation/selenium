package accessmodifiers2;

import accessmodifiers1.Test1;

public class Test4 {// Test1 is the parent class
	// Test3 is teh child class
	public void display() {

		Test1 ob = new Test1();// creation of the object
		//System.out.println("private varible " + ob.a);// The field Test1.a is not visible bcz this is a private variable
		// private variable can be accesed with in the same class
		//System.out.println("default varible " + ob.b);// default can be accessed with in the same calss as well as same
														// package
		//System.out.println("protected varible " + ob.c);// protected can be accessed with in the same class , same
														// package and also in the different package of the class which
														// is exteded with parent class properties
		System.out.println("public varible " + ob.d);//any where in the project

	}
}
