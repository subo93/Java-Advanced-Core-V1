package collectionApi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<>();
        nums.add(23);
        nums.add(1);
        nums.add(0);
        nums.add(23);

        Iterator<Integer> values = nums.iterator();

        //values.
        while(values.hasNext())
            System.out.println(values.next());

       // System.out.println(nums);
    }
}
