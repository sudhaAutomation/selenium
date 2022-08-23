package basics;

public class DataTypes {

	public static void main(String[] args) {
		// Data types:numerics,letters,characters,words,sentences,
		// numerics:0,1,100,100.89,100000.90
		// characters:1,2,S,&,*
		// words:good,bad,
		// a,b,i,
		// am learing testing

		int i = 200;
		double d = 23.89; // primitive data types
		short s = 32676;
		long l = 1843468l;
		char c='t';
		String s1 = "testing";// non primitive
		String s2 = "Testing Training jghjgsjfjsjfjshfjshjfjsfjsjfjsfjsjfbsjjjjjjjjjj   ";

		int value = 1000000000;
		int value1 = 1000000000;
		long va = 1000000000;// implicit type casting:converting the narrow range of the dat type in to wider
								// range of the data type

		long l2 = 232322142432l;
		int i1=(int)232322142432l;// explicit type casting:converting the wider range of the dat type in to
									//narrow range of the data type
//lost some data
		System.out.println(value);
		System.out.println(i);
		System.out.println(l);
		System.out.println(s1);
		System.out.println(s2);

	}

}
