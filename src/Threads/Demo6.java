package Threads;

public class Demo6 {

    // explain thread states in java
    // 1. New: The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
    // 2. Runnable: The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
    // 3. Running: The thread is in running state if the thread scheduler has selected it.
    // 4. Waiting: This is the state when a thread is waiting for some action to be performed.
    // 5. Timed Waiting: A thread is in timed waiting state when it calls a method with a time out parameter. For example, Thread.sleep(1000);
    // 6. Terminated: A thread is in terminated or dead state when its run() method exits.
    // provide an example for each state of a thread in java
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
        });
        System.out.println("Thread state: 1 " + t1.getState());
        t1.start();
        System.out.println("Thread state: 2 " + t1.getState());
        try {
            t1.join(); // This waits for t1 to finish before continuing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state: 3 " + t1.getState());
        System.out.println("Thread has finished");
        System.out.println("Thread state: 4 " + t1.getState());
    }
}
