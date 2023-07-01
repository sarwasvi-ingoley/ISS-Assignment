package arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterate {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "C++", "Java", "Python");
        // basic for loop
        System.out.println("\nbasic for loop");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        //for each
        System.out.println("\nfor each");
        courses.forEach((element)->{
            System.out.println(element);
        });
        // enhanced foreach
        System.out.println("\nenhanced foreach");
        for (String course: courses) {
            System.out.println(course);
        }
        // basic loop with iterator
        System.out.println("\nbasic loop with iterator");
        Iterator<String> values = courses.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
