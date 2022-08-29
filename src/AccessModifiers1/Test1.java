package AccessModifiers1;

public class Test1 {
	
private int a;//only with in the same class

int b;
protected int c;
public int d;
public void Display() {
	System.out.println("private int "+a);
	System.out.println("Default int  "+b);
	System.out.println("Protected int"+c);
	System.out.println("Public int"+d);
}
}
