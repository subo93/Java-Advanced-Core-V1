package Threads;

public class Demo5 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
        });

        t1.start();
        try {
            t1.join(); // This waits for t1 to finish before continuing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has finished");
    }
}
