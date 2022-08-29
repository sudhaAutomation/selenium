package MyClasswork;

public class Constructor {// this will help us to initialise the varibles using the class and the constructor
	//to develop proto type
	String name;
	int model;
	String colour;
String ca;
	 public Constructor() {//
		
		System.out.println("0 parameters ");
	 }
	 public Constructor(int i) {//1 prametr
			
			System.out.println("1 parameters ");
			System.out.println(i);
		 }
	 public Constructor(int i,String s) {//1 prametr
			
			System.out.println("2 parameters ");
			System.out.println(i+" "+s);
		 }
	 public Constructor(String name,int model,String colour) {//3 prametr
			
		this. name=name;//class variable = local varibles
		this. model=model;
		this. colour=colour;
			System.out.println("3 parameters ");
			System.out.println(name+" "+model +" "+colour);
			System.out.println(ca);
		 }
	
	 

	public static void main(String[] args) {
		new  Constructor();//0 params
		new  Constructor(30);//1 [params
		new  Constructor(60,"Test");//2 params	
		new Constructor("BMW", 2020,"red");
		new Constructor("audi", 2021,"black");
		
	}
	//WE CAN OVER LOAD the constructor(method over loading possible)
}
