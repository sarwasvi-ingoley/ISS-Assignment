package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassExample {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add(0,"orange");
        fruits.add("mango");
        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
