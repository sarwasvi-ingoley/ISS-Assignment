package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AcessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>();
        System.out.println("Is list empty? " + topProgrammingLanguages.isEmpty());
        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        System.out.println(topProgrammingLanguages.size());
        String bestProgrammingLanguage = topProgrammingLanguages.get(1);
        System.out.println(bestProgrammingLanguage);
        String secondProgrammingLanguage = topProgrammingLanguages.get(0);
        System.out.println(secondProgrammingLanguage);

        //modify an element
        topProgrammingLanguages.set(3, "C#");
        System.out.println(topProgrammingLanguages);

    }
}
