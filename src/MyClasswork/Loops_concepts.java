package MyClasswork;

public class Loops_concepts {

	public static void main(String[] args) {
		// loops importance
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 3");
		System.out.println("hello 4");
		System.out.println("hello 5");
		//while loop
		System.out.println("out put of the while loop");
		int  counter=1;//initialisation
		while(counter<=10) //conditiona part
		{
			System.out.println("hello "+counter);
						counter++;//incremental part
				}
		
		System.out.println("out put of the do- while loop");
		
		
		int  counter2=1;//initialisation
		do{
			System.out.println("hello "+counter2);
				counter2++;//incremental part
				}
		while(counter2<=10); //conditions part	
		System.out.println("out put of the for loop");
		
		
		
		for(int  counter3=1;counter3<=10;counter3++) //initialisation//conditiona part//incremental part
		{
			
			System.out.println("hello "+counter3);
		}
		//dis advantage of the while and do while loop is .
		//if we for got to give the incremnetal or decrental part.....loop will repeat infinite times 
		
		int i=1;
		while(i<=10) {
			System.out.println("hello sudha "+i);
			i++;
		}
		int k=1;
		 do{
			System.out.println("hello sudharani "+k);
			k++;
		}while(k<=10);
		
for(int j=1;j<=10;j++) {
	System.out.println("hi ra"+j);
}
System.out.println("output with switch statement");
switch(i) {
case 10:
	System.out.println("100 and 10 are not same");
	break;
case 20:
	System.out.println("100 and 20 are not same");
	break;
case 1000:
	System.out.println("100 and case 100 is same");
	break;
	
	default:
		System.out.println("all cases are failed with int i");
}
String name="testing";
switch(name) {
case "qtp":
	System.out.println("qtp course is availble");
	break;
case "saleforce":
	System.out.println("saleforce course is availble");
	break;
case "testing":
	System.out.println("Testing course is availble");
	break;
	
	default:
		System.out.println("all cases are failed with name");
}


}}
