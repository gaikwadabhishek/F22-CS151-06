package multithreading;

// defining a Thread
class MyRunnable implements Runnable {
	// defining the job of a Thread
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable); // runnable here is target runnable
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("parent thread");
		}
	}
}
