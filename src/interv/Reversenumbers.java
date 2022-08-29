package interv;

public class Reversenumbers {

	public static void main(String[] args) {
		// 1.using algorthm
		long l=123456789l;
		long rev=0;
		while (l!=0) {
			rev=rev*10+l%10;
			l=l/10;
		}
		System.out.println("the reverse num is "+rev);
		
		//2.by using stringBuffer and reverse method
		
		long lon=98775554l;
		StringBuffer rev2=new StringBuffer(String.valueOf(lon)).reverse();
		System.out.println(rev2);
		//System.out.println(new StringBuffer(String.valueOf(lon)).reverse());
	}

}
