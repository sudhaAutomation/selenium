package AccessModifiers1;

public class Test2 {
	public void Display() {
		Test1 obj=new Test1();
		//System.out.println("private int "+(obj.a));//private access modifier variable can be used only with in the  same class
		System.out.println("Default int  "+(obj.b));
		System.out.println("Protected int"+(obj.c));
		System.out.println("Public int"+(obj.d));
	}
}
