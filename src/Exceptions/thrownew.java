package Exceptions;


public class thrownew {
	int accountnumber=9009877;
	int amount=10000;
	public void display() {
		System.out.println("My account number is "+accountnumber);
		System.out.println("Current Balance in account is "+amount);
		
	}
	public void deposit(int amount) {
		System.out.println("Deposited amonut is "+amount);
	this.amount=this.amount+amount;
	display();
	}
	public void withdraw(int amount) throws Exception {
		System.out.println("with drwan amount "+amount);
		System.out.println("Deposited amonut is "+amount);
		if (amount<this.amount) {
			this.amount=this.amount-amount;
		} else {
//System.out.println("Insufficient amount in the account");
			throw new Exception("Minimum Balance Voilation");
		}
	
	display();
	}	
class test extends Exception{
	public static final String message="minimum balance voilation ";
	public test() {
		//super(message);
	}
}
	public static void main(String[] args) throws Exception {
		thrownew ob=new thrownew ();
		ob.display();
		ob.deposit(2000);
try {
	ob.withdraw(25000);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println(e.getMessage());
}
	}

}
