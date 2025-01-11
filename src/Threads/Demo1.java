package Threads;

class Aaa extends Thread {
//    void m() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Class A!");
//        }
//
//    }

       public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Class A!");
        }

    }

}

class Bbb extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Class B!");
        }
    }
}


public class Demo1 {
    public static void main(String[] args) {

        Aaa a = new Aaa();
        Bbb b = new Bbb();

//        a.m();
//        b.m();
        a.start();
        b.start();
    }
}
