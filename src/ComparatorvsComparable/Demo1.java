package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(12);
        arrayList1.add(1);
        arrayList1.add(80);

        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                //sort by 2nd digit

                if (a % 10 < b % 10) {
                    return 1;
                } else {
                    return -1;
                }
            };

         //  Comparator c1 = (a, b) -> 0;
        };
        //appy comparator
        Collections.sort(arrayList1, c);
        System.out.println("Sorted with COmparator::" + arrayList1);
    }
}
