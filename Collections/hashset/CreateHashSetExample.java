package hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add(null);
        System.out.println(fruits);

    }
}
