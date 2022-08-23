package exceptions;

public class Exception2 {
	int accountnumber = 97328632;
	int amount = 5000;

	public void display() {
		System.out.println("my account number is " + accountnumber);
		System.out.println("my current balance in the account is " + amount);
	}

	public void deposit(int amount) {
		System.out.println("my deposited amount is " + amount);
		this.amount = this.amount + amount;
		display();
	}

	public void withDraw(int amount) throws Exception {

		if (amount <= this.amount) {
			
			this.amount=this.amount-amount;
			System.out.println("withdrawn amount is " + amount);
		} else {
			throw new Exception("in sufficient balance in the account");

		}
		display();

	}

	public static void main(String[] args) throws Exception {
		Exception2 atm = new Exception2();
		atm.display();
		atm.deposit(5000);
		atm.withDraw(15000);

	}

}
