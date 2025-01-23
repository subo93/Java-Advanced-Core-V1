package collectionApi;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        // Initializing both lists
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Accessing an element (Random Access)
        System.out.println("\nAccess Element at Index 2:");
        System.out.println("ArrayList: " + arrayList.get(2)); // O(1)
        System.out.println("LinkedList: " + linkedList.get(2)); // O(n)

        // Adding an element in the middle
        arrayList.add(2, 99);
        linkedList.add(2, 99);
        System.out.println("\nAfter Adding 99 at Index 2:");
        System.out.println("ArrayList: " + arrayList); // O(n)
        System.out.println("LinkedList: " + linkedList); // O(1) for adding node

        // Removing an element from the middle
        arrayList.remove(2);
        linkedList.remove(2);
        System.out.println("\nAfter Removing Element at Index 2:");
        System.out.println("ArrayList: " + arrayList); // O(n)
        System.out.println("LinkedList: " + linkedList); // O(1)
    }
}
