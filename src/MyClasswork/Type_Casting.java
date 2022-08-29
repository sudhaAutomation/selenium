package MyClasswork;

public class Type_Casting {

	public static void main(String[] args) {
	int i=20;
	long l=1233455556;
	l=i;
System.out.println(l);
System.out.println(i);

double d=1200;//inta data type is narrow range of data compared to double data type...implicit data type....done atomatically
System.out.println(d);
float f=(float)12.34;//double>float>int
//explicit type casting: converting the wider range of dat type into narrow range of data type

//:::data type  variable name = (data type )value;


//Forcefully done by the programmer
int i1=(int)123l;// we lost some data
float f1=12f;
System.out.println(f);
System.out.println(i1);
System.out.println(f1);
	}

}
