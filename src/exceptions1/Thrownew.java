package exceptions1;

public class Thrownew {

	int accountnumber = 9022211;
	int amount = 10000;

	public void display() {
		System.out.println("My account number is " + accountnumber);
		System.out.println("Current balance in my acount is " + amount);
	}

	public void deposit(int amount) {
		System.out.println("deposited amount is " + amount);
		this.amount = this.amount + amount;// deposited amonut added to the curernt balance
		display();
	}

	public void withdraw(int amount) throws Exception {
		System.out.println("withdrwan amount is " + amount);
		if (amount < this.amount) {
			this.amount = this.amount - amount;
		} else {
			// System.out.println("insuffient funds in account");
			try {
				throw new Exception("Minimum Balance Voilated");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		display();
	}

	public static void main(String[] args) throws Exception {
		Thrownew ob = new Thrownew();
		ob.display();
		ob.deposit(5000);
		try {
			ob.withdraw(20000);
		} catch (MinimumBalanceVoilation e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("final execution");
		}

		System.out.println("******");
	}

}
