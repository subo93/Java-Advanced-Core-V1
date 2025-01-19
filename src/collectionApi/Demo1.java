package collectionApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.removeIf(e -> e == 3);

        collection.add(3);
        collection.add(4);
        System.out.println(collection.contains(3));


        List<Integer> list = new ArrayList<>();
//        list.add(9);
//        list.set(2,4);
//        list.set(1,99);
//        System.out.println(list);

        list.add(9);
        list.add(0); // Adding a placeholder element at index 1
        list.add(4); // Adding a placeholder element at index 2
        list.set(1, 99);
        System.out.println(list);



    }
}