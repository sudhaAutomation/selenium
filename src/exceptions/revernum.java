package exceptions;

public class revernum {
	public static void main(String[] args) {

		int i = 12345;
		int rev = 0;
		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
			System.out.println(rev);
		}
		System.out.println(rev);
		int j=1234567;
		StringBuffer rev2=new StringBuffer(String.valueOf(j)).reverse();
		System.out.println(rev2);
	}
	
	
	
}
