package MyClasswork;

public class functionmain {
	public static void main(String[] args) {
		// object creation
		//new keyword create the object
		Functions	obj=new Functions();//obj is the reference name eof the object
		obj.test();
	int add=obj.sum();
	
	System.out.println("addition of 10 and 20 is"+add);
	int mul=obj.pro(20, 30);
	
	System.out.println("product of 20 and 30 is"+mul);	
	int mul2=obj.pro(200, 300);
	
	System.out.println("product of 200 and 300 is"+mul2);	
	obj.login("admin", 123456);
	System.out.println("login module"+obj.login("admin", 123456));	
		}
}
