package exceptions;

public class Throw {

    public static void main(String[] args) {

        //  int i = 0; // calls throw
        //  int i = 10; // <10
        int i = 40; // > 20


        int j = 0;

        try {
            j = 20 / i;
            if (j == 0)
                throw new ArithmeticException("Division by zero");

        } catch (ArithmeticException e) {
            j = 20 / 1;
            System.out.println("catch Arthmetic ::: " + e.getMessage());

        }
        System.out.println("j=" + j);
    }


}
