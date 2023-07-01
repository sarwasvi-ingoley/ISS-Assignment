package linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLL {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("mango");
        fruitList.add("orange");
        System.out.println(fruitList);

        // remove first element in the LL
        System.out.println(fruitList.removeFirst()); // returns the element
        System.out.println(fruitList);

        // remove last element
        System.out.println(fruitList.removeLast()); // returns the element
        System.out.println(fruitList);

        // removing first occurance of an element
        System.out.println(fruitList.remove("apple")); // returns if element was removed (boolean value)
        System.out.println(fruitList);

        fruitList.clear();
        System.out.println(fruitList);
    }
}
