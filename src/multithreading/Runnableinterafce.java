package multithreading;
class runnable1 implements Runnable{
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("Thread1 Hai "+i);
			try {
				Thread.sleep(2000);//this will cease the execution temporarily as per the mention time
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class runnable2 implements Runnable{
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("Thread2 Hai "+i);
			try {
				Thread.sleep(2000);//this will cease the execution temporarily as per the mention time
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class Runnableinterafce {

	public static void main(String[] args) {
		System.out.println("main Thread Hai ");
		runnable1 obj1=new runnable1();
		runnable2 obj2=new runnable2();
		//obj1.st
 Thread t1=new Thread( obj1);
 Thread t2=new Thread(obj2);
 t1.start();
 t2.start();
	}

}
