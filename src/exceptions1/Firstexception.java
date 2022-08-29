package exceptions1;

public class Firstexception {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(10/2);//5
		try {
			System.out.println(10/5);
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			
			System.out.println("my error cause is "+e.getCause());
			System.out.println("my error is "+e.getMessage());
			System.out.println("my error calss is  "+e.getClass());
		}//infinte
		int a[]= {10,20,30,40};
		System.out.println(a.length);//4
		try {
			//System.out.println(a[4]);
			System.out.println(a[3]);
		} catch (Exception e) {
			
		System.out.println("my error cause is "+e.getCause());
		System.out.println("my error is "+e.getMessage());
		System.out.println("my error calss is  "+e.getClass());
		
		}//ArrayIndexOutOfBoundsExeption
		
finally	 {
			System.out.println("execute finally statement");
		}
		System.out.println("Hello");
		System.out.println("Hello");
		
		
	}


}
//Try block
//catch ..try-catch exception handling