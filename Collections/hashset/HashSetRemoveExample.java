package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        for(int i = 1; i<=10; i++) {
            numbers.add(i);
        }

        // remove()
        System.out.println(numbers.remove(2));
        System.out.println(numbers);

        Set<Integer> evenNumbers = new HashSet<>();
        for(int i = 2; i<=10; i=i+2) {
            evenNumbers.add(i);
        }
        numbers.removeAll(evenNumbers);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

    }
}
