package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        System.out.println("::::::::::::::::::::::::::::: Thread poolong:::::::::::::::::::::::::::");

        //example for thread pooling
        // 1. Create a fixed thread pool with 5 threads

        // 2. Submit 10 tasks to the thread pool
        // 3. Print the thread name for each task
        // 4. Shutdown the thread pool
        // 5. Print a message after the thread pool has been shut down
        // 6. Submit another task to the thread pool
        // 7. Print the thread name for the task
        // 8. Print a message that the thread pool has been shut down
        // 9. Print a message that the task was not executed because the thread pool has been shut down
        // 10. Print a message that the program has finished
        // 11. Run the program and observe the output
        // 12. Change the thread pool to a cached thread pool and run the program again
        //give me the code now
          //example code for thread pooling
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("Task " + finalI + " is running on thread " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
        System.out.println("Thread pool has been shut down");
        executorService.submit(() -> {
            System.out.println("Task 11 is running on thread " + Thread.currentThread().getName());
        });
        System.out.println("Thread pool has been shut down");
        executorService.shutdown();
        executorService.submit(() -> {
            System.out.println("Task 12 is running on thread " + Thread.currentThread().getName());
        });
        System.out.println("Task was not executed because the thread pool has been shut down");
        System.out.println("Program has finished");

    }
}
