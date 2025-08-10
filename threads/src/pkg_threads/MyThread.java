package pkg_threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Value: " + i);
			try {
				Thread.sleep(50); // Pause for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Thread-1");
		t2.setName("Thread-2");

		t1.start(); // Starts the first thread
		t2.start(); // Starts the second thread
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Value: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "Thread-1");
		Thread t2 = new Thread(runnable, "Thread-2");
		t1.start();
		t2.start();
	}
}
