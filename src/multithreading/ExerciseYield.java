package multithreading;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("child thread");
		}
	}
}


public class ExerciseYield {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
