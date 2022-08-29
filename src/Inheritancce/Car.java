package Inheritancce;

public class Car extends vehicle {

	public void cardesign() {
		System.out.println("Designing the Car model");
	}
	public void start() {//overriden method
		System.out.println("Start the Car");
	
	} 
	public void stop() {
		System.out.println("Stop the Car");
	}

}
