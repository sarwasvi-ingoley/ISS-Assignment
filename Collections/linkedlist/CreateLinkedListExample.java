package linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        // add()
        // add(2, element)
        // addFirst()
        // addLast()
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        System.out.println(fruits);

        //add with index
        fruits.add(2, "orange");
        System.out.println(fruits);

        // adding at beginning
        fruits.addFirst("watermelon");
        System.out.println(fruits);

        //adding at the end
        fruits.addLast("strawberry");
        System.out.println(fruits);


    }
}
