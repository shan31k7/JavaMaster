package n_concurreny;

public class ImplementsRunnable {
	// Responsiveness - multi tasking
	// Performance - parallel

	// implement runnable interface
	// child class of Thread class
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = (new Thread(new Math_Multiplies(2, 10000000)));
		thread1.start();
		thread1.join();
		// Thread.sleep(100);
		thread1.interrupt();
	}
}

class Math_Multiplies implements Runnable {
	int i = 1;
	int occurence = 0;

	Math_Multiplies(int i, int occurence) {
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
		}finally {
		}
	}
}