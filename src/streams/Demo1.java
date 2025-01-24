package streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(23);

        //filter
        System.out.println(":::::::::::::::::::::::::::Filter:::::::::::::::::::::::::::::");
        List<Integer> filteredList = list.stream()
                .filter(n -> n % 2 == 0).toList();
        System.out.println(filteredList);
        System.out.println(":::::::::::::::::::::::::::Map:::::::::::::::::::::::::::::");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(100);
        list1.add(3);
        List<Integer> squaredList = list1.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredList);

        System.out.println("::::::::::::foreach::::::::::::::::::::");
        list.stream().forEach(System.out::println);

        System.out.println("::::::::::::Reduce::::::::::::::::::::");
        //test more
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(300);
        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println(":::::::::::collect::::::::::::::::::::");
        List<Integer> collectedList = list.stream()
                .collect(Collectors.toList());

        System.out.println(collectedList);

        System.out.println(":::::::::::sort::::::::::::::::::::");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(211);
        linkedList.add(32);
        List<Integer> sortedList = linkedList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println(":::::::::::distinct::::::::::::::::::::");
        LinkedList<Integer> linkedList1 = new LinkedList<>();
       linkedList1.push(33);
        linkedList1.push(33);
        linkedList1.add(2);

        List<Integer> distinctList = linkedList1.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctList);

        System.out.println(":::::::::::limit::::::::::::::::::::");

        List<Integer> limitedList = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limitedList);

        System.out.println(":::::::::::skip::::::::::::::::::::");

        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

        List<Integer> skippedList = list4.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(skippedList);


    }
}
