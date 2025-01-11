package Threads;

public class Demo3 {
    public static void main(String[] args) {

        //creating anonymouse classes with Runnable interface!

        Runnable rn1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Class A!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable rn2 = () -> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Class BBBB!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread t1 = new Thread(rn1);
        Thread t2 = new Thread(rn2);

        t1.start();
        t2.start();
    }
}
