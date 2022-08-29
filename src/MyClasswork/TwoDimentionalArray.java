package MyClasswork;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// 2 dimensional array
		// 2 rows and 3 columns....2*3
		char i[][] = new char[2][3];
		i[0][0] = 'A';
		i[0][1] = 'B';
		i[0][2] = 'C';
		i[1][0] = 'G';
		i[1][1] = 'H';
		i[1][2] = 'I';
		System.out.println(i[1][2]);
		System.out.println(i.length);
		System.out.println(i[0].length);
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[0].length; j2++) {
				System.out.println(i[j][j2]);
			}
	
		}

	}

}
