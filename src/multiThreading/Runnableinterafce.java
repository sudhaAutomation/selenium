package multiThreading;

class Runnable1 implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread1 values of i is " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Runnableinterafce implements Runnable {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread2 values of i is " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runnable1 r1 = new Runnable1();
		Runnableinterafce r2 = new Runnableinterafce();
		// r1.run();
		// r2.run();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
