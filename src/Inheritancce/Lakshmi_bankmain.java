package Inheritancce;

public class Lakshmi_bankmain {

	public static void main(String[] args) {
		System.out.println(Main_project.min_bal);
		Lakshmi_bank obj=new Lakshmi_bank ();
		obj.Credit_accout();
		obj.debit_account();
		obj.Instant_Account_opening();
		obj.mobile_banking();
		obj.Personal_loan();
		obj.marketing();
		System.out.println(obj.min_bal);
		
	}

}
