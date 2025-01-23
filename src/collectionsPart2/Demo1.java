package collectionsPart2;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();
        student.put("John", 90);
        student.put("Doe", 80);
        student.put("Smith", 70);
        student.put("John", 85);
        student.put("Subodhi", 95);
        System.out.println(student);
        System.out.println(student.get("Subodhi"));

        System.out.println(student.keySet());

        for (String key : student.keySet()) {
            {
                System.out.println(key);
            }
        }

    }

}
