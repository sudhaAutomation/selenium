package Inheritancce;

public class inheritancemain {
	public static void main(String[] args) {
		// create an object for inheritance properties
		BMW_child obj = new BMW_child();
		System.out.println("**** BMW_child class reference variable****");
		obj.cardesign();
		obj.BMWdesign();
		obj.theftsecurity();
		// BMW can Start
		// overriden method
		obj.vehicledesign();
		obj.start();// overriden method
		// method overriding: the method which is present in the parent class as well as
		// the child class with same name and with same parameters is called as method
		// over riding....in out put only child class method is executed.

		System.out.println("**** car class reference variable****");
		Car c = new Car();

		c.cardesign();
		c.start();
		c.stop();
		c.vehicledesign();

		// Top casting
		Car C1 = new BMW_child();// Dymanic polymorphism and also called run time polymorphism
		// child class object can be reffered by the parent class reference variable
		// reference variable..here only and only overridden methods/common methods and
		// parent class methods will be called
		C1.cardesign();
		C1.start();
		C1.stop();
		C1.vehicledesign();
		System.out.println("***@ND child jaguar***");
		Jaguar j1 = new Jaguar();
		j1.cardesign();
		j1.start();
		j1.Refuel();
		j1.Refuel();
		j1.vehicledesign();

		// down casting
		BMW_child b = (BMW_child) new Car();
		b.BMWdesign();
		b.cardesign();
		// parent class can not be cast to child class
	}

}
