package basics;

public class StudentDAtaArray {

	public static void main(String[] args) {
		Object c[][] = new Object[2][5];// 2*5
		// int c[][] = new int[2][5];//2*5
		// Object is class:it will stores all the diffretn data types of values
		c[0][0] = 'A';
		c[0][1] = "RAmu";
		c[0][2] = 9.5;
		c[0][3] = "warangal";
		c[0][4] = " H.NO. 8-45";
		c[1][0] = "169cm";
		c[1][1] = 9883473112l;
		c[1][2] = "A+";
		c[1][3] = 2020;
		c[1][4] = true;
		for (int i = 0; i < c.length; i++) {// rows
			for (int j = 0; j < c[1].length; j++) {// coloumns
				System.out.println(c[i][j] + "  ");
			}
			//System.out.println();
		}
		System.out.println("BYe");
		
		Object sname="seetha";
		Object sname1=232754;
		System.out.println(sname);
		System.out.println(sname1);
		String s[]= {"ramu","seetha","lakshmi"};
		System.out.println(s[2]);
	}

}
