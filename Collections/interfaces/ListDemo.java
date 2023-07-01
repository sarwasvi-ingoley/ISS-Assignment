package interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        // List allows us to add duplicate elements in order elements were inserted
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element1");
        System.out.println(list);
        // List allows us to add null elements
        list.add(null);
        list.add(null);
        System.out.println(list);
        // access element from list. Index starts from 0
        System.out.println(list.get(0));

    }
}
