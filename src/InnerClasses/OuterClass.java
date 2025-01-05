package InnerClasses;

public class OuterClass {

    private int outerVar = 10;

    public class InnerClass {
        public void display() {
            System.out.println("Outer variable: " + outerVar);
        }
    }

}

