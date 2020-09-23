package n_concurreny;

import java.math.BigInteger;

public class ExtendsThreadClass {
	// Concurrency
	// Responsiveness - multi tasking
	// Performance - parallel

	// Thread is an smallest individual executable unit
	// group of thread is called Process
	// processor can switch
	// from one thread to another thread within process
	// switch from one process to process

	// implement runnable interface
	// child class of Thread class

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Math_Multiply(2, 10);

		// Thread[] thread1 = new Math_Multiply(2, 10);
		// ArrayList<Thread> thread1 = new ArrayList<Thread>();
		//BigInteger big = new BigInteger();
		thread1.start();
		thread1.join();
		// Thread.sleep(100);
		// thread1.interrupt();
	}
}

// Thread implementation
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
			for (long j = 1; j <= occurence; j++) {
				result += (long) (result * i);
				System.out.println(result);
			}
			System.out.println("Result " + String.valueOf(result));

			if (this.isInterrupted()) {
				throw new InterruptedException();
			}
		} catch (InterruptedException e) {
			System.out.println("Sorry, this is interrupted");
		}
	}
}