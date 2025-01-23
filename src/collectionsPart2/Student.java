package collectionsPart2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String Id;
    int age;

    //generate constructors of no arguments, all arguments
    public Student() {
    }

    public Student(String Id, int age) {
        this.Id = Id;
        this.age = age;
    }

    //toString method
    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", age=" + age + '}';
    }


    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else if (this.age < that.age) {
            return -1;
        } else {
            return 0;
        }

    }
}
