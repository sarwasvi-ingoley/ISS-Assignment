package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LLSearchIterationEx {
    public static void main(String[] args) {
        LinkedList<String> progLangs = new LinkedList<>();
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Java");
        progLangs.add("Python");
        progLangs.add("Python");

        System.out.println(progLangs.contains("Java"));
        System.out.println(progLangs.indexOf("Python"));
        System.out.println(progLangs.lastIndexOf("Python"));

        //Iterating
        // iterator
        System.out.println("\nbasic loop with iterator");
        Iterator<String> values = progLangs.iterator();
        while (values.hasNext()){
            System.out.println((String) values.next());
        }

        // for each
        System.out.println("\nfor each");
        progLangs.forEach(element->{
            System.out.println(element);
        });


    }
}
