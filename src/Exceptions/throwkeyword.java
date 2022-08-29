package Exceptions;

class Bank {
	public int accountnumber = 1091234;
	public int amount = 10000;

	public void display() {
		System.out.println("My account number is " + accountnumber);
		System.out.println("Current Balance in account is " + amount);

	}

	public void deposit(int amount) {
		System.out.println("Deposited amonut is " + amount);
		this.amount = this.amount + amount;// the amount is added by the deposited amount
		display();
	}

	public void withdraw(int amount) throws Exception, MinimumBalanceVoilation {
		System.out.println("withdrawn amount is " + amount);

		if (amount < this.amount) {
			this.amount = this.amount - amount;// the amount is deducted by withdrawn amount
		} else {
			throw new Exception("Minimum Balance voilation");//
		}
		display();
	}
}

class MinimumBalanceVoilation extends Exception {
	static String message = "Minimum Balance voilation";

	public MinimumBalanceVoilation() {
		super(message);
	}
}

public class throwkeyword {

	public static void main(String[] args) throws Exception {
		Bank obj = new Bank();
		obj.display();
		obj.deposit(2000);
		try {
			obj.withdraw(15000);
		} catch (MinimumBalanceVoilation a) {
			// TODO Auto-generated catch block
			a.printStackTrace();
			System.out.println("Error:" + a.getMessage());

		} /*
			 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
			 * System.out.println("Exception:"+e.getMessage());
			 * 
			 * }
			 */
	}

}
