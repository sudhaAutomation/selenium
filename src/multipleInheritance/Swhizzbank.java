package multipleInheritance;

public interface Swhizzbank extends SBI,HDFC,ICICI {
public void personalloans();
public void marketing();
	
	int minbalance=2000;
}
//in interface only abstarct methods present
//the abstract methods doesn,t conatins the method body
//for interface we can,t create an object
//interfaces are non static
//in interafce we can't ininitialize the varible directly',bcz all the variables in terface are final jin nature
