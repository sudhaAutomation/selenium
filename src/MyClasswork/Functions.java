package MyClasswork;

public class Functions {
//1.No input and no out put
	//void means...not contain the return statement
	public void test() {
		System.out.println("test method");
	
	}
	//2.No input but some out put
	public  int sum() {
		System.out.println("Sum method");
		int i=10;
		int b=20;
		int c=i+b;
		System.out.println(c);
		return c;
	}
	//3.some input and some out put
	public  int pro(int x,int y) {
		System.out.println("Product method");
		int a=x*y;
		
		return a;
	}
	//some input and some out put
	public String login(String S,int j) {
		System.out.println("div method");
		String y=S+j;
		return y;
	}
}
