package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitcollection = new ArrayList<>();
        fruitcollection.add("apple");
        fruitcollection.add("grapes");
        fruitcollection.add("orange");
//        fruitcollection.add("orange");
        System.out.println(fruitcollection);
        System.out.println(fruitcollection.size());
        fruitcollection.remove("apple");
        System.out.println(fruitcollection);
        System.out.println(fruitcollection.size()); // shrinks in size because it is referring to the object of array list
        System.out.println(fruitcollection.contains("orange"));
        fruitcollection.forEach((element)-> System.out.println(element));
        Iterator value=fruitcollection.iterator();
        while (value.hasNext()){
            System.out.println(value.next());
        }
        fruitcollection.clear();
        System.out.println(fruitcollection);
    }
}
