package multiTherading;

/**
 * Created by Manohar on 12/30/2016.
 */
class SimpleThread extends Thread {
    @Override
    public void run() {
        for (int i=1 ; i<10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i=20 ; i<30; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class SimlpeThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new SimpleThread());
        Thread t2 = new Thread(new RunnableThread());
        System.out.println("Main Thread is: " + Thread.currentThread().getName());

        displayThreadInfo(t);
//        t.setDaemon(true);
        t.start();
        t2.start();
//        t.join();
        System.out.println("I am in main thread: " + Thread.currentThread().getName());
    }

    private static void displayThreadInfo(Thread t) {
        t.setName("MyFirstThread");
//        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread id: " + t.getId());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());
        System.out.println("Thread State: " + t.getState());
    }
}