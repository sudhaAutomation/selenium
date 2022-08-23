package accessmodifiers2;

import accessmodifiers1.Test1;

public class Test3 extends Test1 {//Test1 is the parent class
	//Test3 is teh child class
	public void display() {
		
		
		//System.out.println("private varible "+a);//The field Test1.a is not visible bcz this is a private variable
		//private variable can be accesed with in the same class
		//System.out.println("default varible "+b);//default can be accessed with in the same calss as well as same package
		System.out.println("protected varible "+c);
		System.out.println("public varible "+d);

	}
}
