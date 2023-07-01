package linkedlist;

import java.util.LinkedList;

public class RetrieveLLExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");

        //getFirst()
        System.out.println(fruits.getFirst());

        // getLast()
        System.out.println(fruits.getLast());

        // getting an element at a given position: get()
        System.out.println(fruits.get(1));

        System.out.println("\nPrinting LL using for each");
        fruits.forEach((element) -> {
            System.out.println(element);
        });

        System.out.println("\nPrinting LL using enhanced for loop");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

    }
}
