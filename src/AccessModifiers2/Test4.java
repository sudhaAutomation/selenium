package AccessModifiers2;

import AccessModifiers1.Test1;

public class Test4 {
	public void Display() {
		Test1 obj = new Test1();
		//System.out.println("private int " + (obj.a));// only with in tha same class
		//System.out.println("Default int  " + (obj.b));// with in the same package
		//System.out.println("Protected int" + (obj.c));// we can access the access modifier different packges as well as
														// the child class of the same parent class
		System.out.println("Public int" + (obj.d));
	}
}
