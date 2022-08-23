package oopsConcepts;

public class Encacpsulation {
private String Username;
private String password;

public void setUsername(String uname) {
	Username=uname;
	System.out.println("My username is "+Username);
}

public String getUsername() {
	return Username;
	
}

public void setPassword(String pswd) {
	password=pswd;
	System.out.println("My username is "+Username);
}

public String getPassword() {
	return password;
	
}
}
