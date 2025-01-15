package exceptions;

public class Demo5 {


        public static void main(String[] args) {
            try {
                System.out.println("Inside try block");
                throw new RuntimeException("Exception from try");
            } finally {
                System.out.println("Inside finally block");
                throw new RuntimeException("Exception from finally");
            }
        }

}
