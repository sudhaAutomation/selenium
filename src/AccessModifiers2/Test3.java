package AccessModifiers2;

import AccessModifiers1.Test1;

public class Test3 extends Test1 {
	public void Display() {

		//System.out.println("private int " + (obj.a));// private access modifier variable can be used only with in the
														// same class
		//System.out.println("Default int  " + b);//default access modifier is accessed only with in the same package
		System.out.println("Protected int" + c);// we can access the access modifier different packges as well as
		// the child class of the same parent class
		System.out.println("Public int" + d);
	}
}
