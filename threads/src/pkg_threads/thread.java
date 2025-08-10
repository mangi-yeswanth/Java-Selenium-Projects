package pkg_threads;

class ControlledThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Main thread starts….");
		ControlledThread t1 = new ControlledThread();
        ControlledThread t2 = new ControlledThread();
        ControlledThread t3 = new ControlledThread();
 
        t1.setName("Worker-1");
        t2.setName("Worker-2");
        t3.setName("Worker-3");
 
        System.out.println("Starting threads...");
        t1.start();
        try {
            // Wait for t1 to finish before continuing
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
		t2.start();
		try {
		t2.join();
		}
		catch (InterruptedException e) {
            System.out.println(e);
		}
		finally {
		t3.start();
		}
        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());
        System.out.println("Is " + t3.getName() + " alive? " + t3.isAlive());
 
        //System.out.println("Main thread finished.");
    }
}
