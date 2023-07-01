package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterate {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C++");
        courses.add("C");
        courses.add("Python");
        System.out.println(courses.isEmpty());
        System.out.println("\nEnhanced for loop");
        for(String course:courses) {
            System.out.println(course);
        }

        System.out.println("\nIterator");
        Iterator<String> value = courses.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        for (Iterator<String> value2 = courses.iterator(); value2.hasNext();) {
            System.out.println(value2.next());
        }

        System.out.println("\nFor each");
        courses.forEach((course)->{
            System.out.println(course);
        });


    }
}
