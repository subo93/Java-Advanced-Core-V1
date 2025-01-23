package collectionsPart2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        //Collection c = new Collection();
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(22);
        list.add(35);
        System.out.println("=== Before Sorting ===" + list);
        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
               if(a%10 > b%10){
                   return 1;//explain this block


               }else
                   return -1;
            }
        };
        //
        Collections.sort(list, c);
        System.out.println("=== After Sorting ===" + list);

        System.out.println(":::::::::::::with a object::::::::::::::::::::");
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", 23));
        students.add(new Student("S002", 21));
        students.add(new Student("S003", 25));
        students.add(new Student("S004", 22));

        Comparator<Student> c2 = (Student a, Student b) ->
        {
               return (a.age > b.age) ? 1 : -1;
        };

        System.out.println("=== Before Sorting Students ===" + students);
        Collections.sort(students, c2);
        System.out.println("=== After Sorting Students ===" + students);
        for(Student s: students){
            System.out.println(s.Id + " " + s.age);

        }
        System.out.println(":::::::::::::with Cmparable::::::::::::::::::::");
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("S001", 23));
        students2.add(new Student("S002", 21));
        students2.add(new Student("S003", 25));
        students2.add(new Student("S004", 22));
        System.out.println("=== before Sorting with Comparable ===" + students2);

        for(Student s: students2){
            System.out.println(s.Id + " " + s.age);

        }
        Collections.sort(students2);
        System.out.println("=== After Sorting with Comparable ===" + students2);

        for(Student s: students2){
            System.out.println(s.Id + " " + s.age);

        }
        System.out.println("=== foreach ===" );
        //consumer accept method
        students2.forEach(n-> System.out.println(n.Id + " " + n.age));
    }

}
