package collectionApi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4 {

    public static void main(String[] args) {
      //exmaple for Queue
        //Queue is a collection used to hold multiple elements prior to processing.
        //Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.
        //Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation).
        //The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.
        //Queue implementations generally do not allow insertion of null elements, although some implementations, such as LinkedList, do not prohibit insertion of null.
         //give a simple code exmaple for Queue
        //Queue is an interface, so we can't create an object of it
        //We can create an object of its implementing classes like PriorityQueue, ArrayDeque, LinkedList
        //Queue<String> queue = new Queue<String>(); //Compile time error
        Queue<String> queue = new PriorityQueue<String>(); //Valid
        queue.add("A");
        queue.add("B");
        queue.add("C");
        //now do some operations on queue
        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.peek());
        System.out.println("Iterating the queue elements:");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("::::::::::::::LinkedList:::::::::::::::");
        LinkedList<String> queue1 = new LinkedList<>();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        //now do some operations on queue
        System.out.println("Head: "+queue1.element());
        System.out.println("Head: "+queue1.peek());
        System.out.println("Iterating the queue elements:");
        Iterator itr1 = queue1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //usages of Queue/Linklist/ pros anf cons
        //Queue is an interface, if we want to use it, we need to create an object of its implementing classes like PriorityQueue, ArrayDeque, LinkedList
        //LinkedList is a class, so we can create an object of it directly
      //ArrayList vs LinkedList explain with a simple code


    }
}
