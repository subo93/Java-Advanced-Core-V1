package Threads;

class Counter{
    int count;
    public synchronized void increament(){
         count++;
    }
}

public class Demo4 {

    public static void main(String[] args) {

        //creating anonymouse classes with Runnable interface!

        Counter c = new Counter();

        Runnable rn1 = () -> {
            for (int i = 0; i < 1000; i++) {
              c.increament();
            }
        };

        Runnable rn2 = () -> {

            for (int i = 0; i < 1000; i++) {
               c.increament();
            }

        };

        Thread t1 = new Thread(rn1);
        Thread t2 = new Thread(rn2);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.count);
    }

}
