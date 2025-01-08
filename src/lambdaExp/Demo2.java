package lambdaExp;

public class Demo2 {
    public static void main(String[] args) {
        A obj = (int a, int b) -> a+b;

        int result = obj.add(1,9);
        System.out.println("==== Simple lambda expression ==== Demo2");
        System.out.println(result);
    }
}
