package multithreading;

//defines a thread
class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread " + this.getId() + " " + i);
			
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread(); // thread initiation
		MyThread thread1 = new MyThread(); // thread initiation
		MyThread thread2 = new MyThread(); // thread initiation

		thread.run();
		// thread.run() // run on the same thread
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread " + i);
		}
	}
}
