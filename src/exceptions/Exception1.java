package exceptions;

public class Exception1 {

	public static void main(String[] args) {

		int i = 10;
		System.out.println("i value is " + i);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println(i/2);//5
		
		try {
			System.out.println(i/0);//ArithmeticException
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
			System.out.println("reason for the error is "+e.getMessage());
			
		}finally {
			System.out.println("finally block executed");
		}
		
		
		System.out.println(i/1);//10
		
		System.out.println("hello");

	}

}
