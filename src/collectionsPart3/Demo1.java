package collectionsPart3;

import java.lang.reflect.Array;
import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        //Array- Fixed size!
        System.out.println(":::::::::::::::::::::::::::Array:::::::::::::::::::::::::::::");
        int[] arr= new int[10];
        arr[0] = 1;
        arr[1] = 23;
        arr[2]=3;
        arr[3] = 5;
        //get size of array
        System.out.println("Length of Array::"+arr.length);
        System.out.println("Array::"+ Arrays.toString(arr));
        System.out.println("with stream::" + Arrays.toString(Arrays.stream(arr).sorted().toArray()));
        System.out.println("without stream::" + Arrays.toString(arr));
       // Arrays.sort(arr);
      //  System.out.println("::::::::::Array Sorted::::::"+ Arrays.toString(arr));

        //Collection
        Collection<Integer> c1 = new ArrayList<Integer>() {
        };

        //List
        System.out.println(":::::::::::::::::::::::::::List:::::::::::::::::::::::::::::");

        //ArrayList - Resizable array
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(12);
        arrayList1.add(1);
        System.out.println("ArrayList::"+arrayList1);
        //get length of arraylist
        System.out.println("Length of ArrayList::"+arrayList1.size());

        //LinkedList - Doubly linked list
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(12);
        linkedList1.add(2);
        linkedList1.push(3);
        linkedList1.push(23232323);
        System.out.println("LinkedList::"+linkedList1);
        //get length of linkedlist
        System.out.println("Length of LinkedList::"+linkedList1.size());
        //middle element
        System.out.println("Middle Element::"+linkedList1.get(linkedList1.size()/2));

        //Queue
        System.out.println(":::::::::::::::::::::::::::Queue:::::::::::::::::::::::::::::");
        //PriorityQueue - Priority queue
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add(12);
        priorityQueue1.add(2);
        priorityQueue1.add(333);
        priorityQueue1.peek();
        System.out.println("PriorityQueue::"+priorityQueue1);
        //get length of priorityqueue
        System.out.println("Length of PriorityQueue::"+priorityQueue1.size());
        System.out.println("Peek of PriorityQueue::"+priorityQueue1.peek());
        System.out.println("Poll of PriorityQueue::"+priorityQueue1.poll());
        // get last in queue
        System.out.println("Last Element::"+priorityQueue1.peek());

        System.out.println(":::::::::::::::::::::::::::Set:::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::HashSet:::::::::::::::::::::::::::::");

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(12);
        hashSet1.add(12);
        hashSet1.add(231);
        hashSet1.add(2);

        System.out.println("HashSet::"+hashSet1);

        //get length of hashset
        System.out.println("Length of HashSet::"+hashSet1.size());

        //TreeSet - Sorted set
        System.out.println(":::::::::::::::::::::::::::TreeSet:::::::::::::::::::::::::::::");
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(12);
        treeSet1.add(12);
        treeSet1.add(54);
        treeSet1.add(231);
        treeSet1.add(2);

        System.out.println("TreeSet::"+treeSet1);

        System.out.println(":::::::::::::::::::::::::::Map:::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::HashMap:::::::::::::::::::::::::::::");

        //HashMap - Key value pair
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "One");
        hashMap1.put(2, "Two");
        hashMap1.put(3, "Three");

        System.out.println("HashMap::"+hashMap1);

        //access value by key
        System.out.println("Value of key 2::"+hashMap1.get(2));

        System.out.println(":::::::::::::::::::::::::::LinkedHashMap:::::::::::::::::::::::::::::");
        LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>();
        //add element

        linkedHashMap1.put("One", 1);
        linkedHashMap1.put("Two", 2);

        System.out.println("::::::::::::::::::::::::::::::::TreeMap::::::::::::::::::::::::::::::::");
        TreeMap<String, String> treeMap1 = new TreeMap<>();
        treeMap1.put("f", "a");
        treeMap1.put("cc", "b");
        treeMap1.put("aa", "c");
        //sorted using keys
        System.out.println("TreeMap::"+treeMap1);

        //HashTable
        System.out.println(":::::::::::::::::::::::::::HashTable:::::::::::::::::::::::::::::");
        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        hashtable1.put(1, "One");

        //hashmap vs hashtable
        //hashmap - not synchronized, faster
        //hashtable - synchronized, slower
        //hashmap - allows one null key and multiple null values
        //hashtable - does not allow null key or value










    }
}
