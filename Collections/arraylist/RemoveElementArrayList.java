package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");
        System.out.println(fruits);

        // remove
        fruits.remove(1);
        System.out.println(fruits);
//        fruits.remove(6); // exception
        fruits.remove("mango");
        System.out.println(fruits);
        fruits.remove("Mango"); // no exception

        //removeAll
        List<String> subfruits = new ArrayList<>();
        subfruits.add("apple");
        subfruits.add("banana");
        fruits.removeAll(subfruits); // only removes apple because banana is not there in the list
        System.out.println(fruits);

        //clear
        fruits.clear();
        System.out.println(fruits);

    }
}
