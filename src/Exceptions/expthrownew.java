package Exceptions;

public class expthrownew {
int accountnumber=983264;
int amount=1000;
public void display() {
	System.out.println("my account number is "+accountnumber);
	System.out.println("my current balance is "+amount);
}
public void deposit(int amount) {
	System.out.println("deposited amount is "+amount);
	this.amount=this.amount+amount;
	display();
	}
	public void withdraw(int amount ) throws Exception {
		
		if(amount<this.amount) {
			System.out.println("with drawn amount is "+amount);
		}
		else {
			throw new Exception("minimum balance voilation");
				}
		display();
	}
	public static void main(String[] args) throws Exception {
		expthrownew ob=new expthrownew();
		ob.display();
		ob.deposit(2000);
		ob.withdraw(2000);
		
	}
}
