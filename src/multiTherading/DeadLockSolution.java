package multiTherading;

/**
 * Changing the order of using the objects from the prior program (DeadLock.java) with resolve the dead lock. 
 * in different order.
 * 
 * @author Manohar
 *
 */
public class DeadLockSolution {
	public static Object obj1 = new Object();
	public static Object obj2 = new Object();

	public static void main(String args[]) {

		Thread1 T1 = new Thread1("FirstThread");
		Thread2 T2 = new Thread2("SecondThread");
		T1.start();
		T2.start();
	}

	private static class Thread1 extends Thread {

		public Thread1(String name) {
			super(name);
		}

		public void run() {
			synchronized (obj1) {
				System.out.println("Thread 1: Holding lock on obj 1...");
				try {
					Thread.sleep(10); //consider some job is executing here.
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for obj2 ...");
				synchronized (obj2) {
					System.out.println("Thread 1: Holding lock on obj1 & obj2...");
				}
			}
		}
	}

	private static class Thread2 extends Thread {
		public Thread2(String name) {
			super(name);
		}

		public void run() {
			synchronized (obj1) {
				System.out.println("Thread 2: Holding lock on obj 1...");
				try {
					Thread.sleep(10); //consider some job is executing here.
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for obj 2...");
				synchronized (obj2) {
					System.out.println("Thread 2: Holding lock on obj1 & obj2...");
				}
			}
		}
	}
}