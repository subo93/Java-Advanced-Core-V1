package Threads;



    class Aa extends Thread {

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Class A!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

    class Bb extends Thread {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Class B!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public class Demo2 {
        public static void main(String[] args) {

            Threads.Aa a = new Threads.Aa();
            Threads.Bb b = new Threads.Bb();

            b.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Thread.MAX_PRIORITY  = " + Thread.MAX_PRIORITY);
            System.out.println("Thread.MIX_PRIORITY  = " + Thread.MIN_PRIORITY);
            System.out.println("Thread.Norm_PRIORITY  = " + Thread.NORM_PRIORITY);


            System.out.println();
            a.start();
            b.start();
        }
    }

