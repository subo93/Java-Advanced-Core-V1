package Threads;

    class A implements Runnable {

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Class A!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

    class B implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Class B!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public class Demo3 {
        public static void main(String[] args) {

            Threads.A a = new Threads.A();
            Threads.B b = new Threads.B();

           // b.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Thread.MAX_PRIORITY  = " + Thread.MAX_PRIORITY);
            System.out.println("Thread.MIX_PRIORITY  = " + Thread.MIN_PRIORITY);
            System.out.println("Thread.Norm_PRIORITY  = " + Thread.NORM_PRIORITY);


            System.out.println();
            a.start();
            b.start();
        }
    }
