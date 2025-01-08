package exceptions;

public class Demo3 {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;  //
        String str = null;

        int nums[] = new int[5];

        try{
            System.out.println(str.length());
            a=10/b;//if exception happend here it will jump from this to catch block directly
            System.out.println(nums[1]);
            System.out.println(nums[8]);
        } catch (ArithmeticException e) {
            System.out.println(e);
           // throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Other:::: "+e);
        }
        //first 2 are runtime exceptions

    }

}
