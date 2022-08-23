package multiThreading;

class Thread1 extends Thread{

	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("Thread1 values of i is "+i);
			
		}
}
	public void run(int j) {
		for (int i = 0; i <=10; i++) {
			System.out.println("Thread1 values of i is "+i);
			
		}
}
}
public class Threads extends Thread{
	
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("Thread2 values of i is "+i);
			
		}
	}

	public static void main(String[] args) {
		Thread1 ob1=new Thread1();
		Threads ob2=new Threads();
//		ob1.run();
//		ob2.run();
		ob1.start();
		ob2.start();

	}

}
