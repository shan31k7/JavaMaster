package concurreny;

public class Concurrency_Demo {

	// Responsiveness - multi tasking
	// Performance - parallel

	// implement runnable interface
	// child class of Thread class

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Math_Multiply(2, 10000000);
		thread1.start();
		thread1.join();
		// Thread.sleep(100);
		thread1.interrupt();
	}
}

class Math_Multiply extends Thread {
	int i = 1;
	int occurence = 0;

	Math_Multiply(int i, int occurence) {
		this.i = i;
		this.occurence = occurence;
	}

	@Override
	public void run() {

		try {
			long result = 1;
			for (int j = 1; j <= occurence; j++) {
				result = (long) (result * i);
			}

			System.out.println("Result" + result);

			if (this.isInterrupted()) {
				throw new InterruptedException();
			}
		} catch (InterruptedException e) {
			System.out.println("Sorry, this is interrupted");
		}
	}
}