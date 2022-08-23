package constructor;

public class ReverseNumbers {

	public static void main(String[] args) {
		int i = 12345;
		System.out.println(new StringBuffer(String.valueOf(i)).reverse());
		//
		long l = 123456789l;
		long rev = 0;

		while (l != 0) {

			rev = rev * 10 + l % 10;
			l = l / 10;
			System.out.println(rev);

		}
		System.out.println(rev);
	}

}
