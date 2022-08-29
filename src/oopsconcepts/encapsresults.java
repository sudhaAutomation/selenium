package oopsconcepts;

public class encapsresults {

	public static void main(String[] args) {
		encapsulation obj=new encapsulation();
		obj.setUsername("admin");
		String x=obj.getusername();
		System.out.println(" new useranme is "+x);
		obj.setPassword("123456");
		String y=obj.getPassword();
		System.out.println("new password is "+y);
		
	}

}
