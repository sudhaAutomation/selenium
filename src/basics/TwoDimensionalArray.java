package basics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		char c[][] = new char[2][5];//2*5
		// insert the characters into the array
		c[0][0] = 'A';
		c[0][1] = 'B';
		c[0][2] = 'C';
		c[0][3] = 'D';
		c[0][4] = 'E';
		c[1][0] = 'F';
		c[1][1] = 'G';
		c[1][2] = '$';
		c[1][3] = '1';
		c[1][4] = '*';
		//c[1][5] = 'l';//ArrayIndexOutOfBoundsException
		System.out.println(c[1][4]);
		System.out.println(c.length);//2
		System.out.println(c[0].length);
		System.out.println(c[1].length);//5
		
		for (int i = 0; i < c.length; i++) {//rows
			for (int j = 0; j < c[1].length; j++) {//coloumns
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
System.out.println("BYe");
	}

}
