package multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread " + this.getId() + " " + i);
			
		}
	}
}

public class ExercisePriority {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
