package multithreading;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread1 Hello " + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread2 Hello " + i);

		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Threads {

	public static void main(String[] args) {
		System.out.println("main thread Hello");
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		Thread3 obj3 = new Thread3();
		
		 //obj1.run();
		 //obj2.run();
		obj1.start();// when we call this start method it is creating the thread and register with
						// the thread scheduler,it will call the run method directly
		obj2.start();
		//obj3.runn();

	}
}
class Thread3{
public void runn() {
	for (int k = 0; k <=20; k++) {
		
	
	System.out.println("thread 3 "+k);
	}
}
}