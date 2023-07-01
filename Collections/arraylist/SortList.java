package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        // create list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
