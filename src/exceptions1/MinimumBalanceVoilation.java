package exceptions1;

public class MinimumBalanceVoilation extends  Exception
	{
		static final String message="Minimum Balance Voilated";
		public  MinimumBalanceVoilation(String message) {
			
			super(message);
			System.out.println(message);
		} 
	}

