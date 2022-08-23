package accessmodifiers1;

public class Test2 {
	
public void display() {
	Test1 ob=new Test1();//creation of the object
	
	//System.out.println("private varible "+ob.a);//The field Test1.a is not visible bcz this is a private variable
	//private variable can be accesed with in the same class
	System.out.println("default varible "+ob.b);//default can be accessed with in the same calss as well as same package
	System.out.println("protected varible "+ob.c);
	System.out.println("public varible "+ob.d);

}
}
