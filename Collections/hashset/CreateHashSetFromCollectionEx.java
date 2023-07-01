package hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetFromCollectionEx {
    public static void main(String[] args) {
        Set<Integer> firstFiveEvenNos = new HashSet<>();
        firstFiveEvenNos.add(2);
        firstFiveEvenNos.add(4);
        firstFiveEvenNos.add(6);
        firstFiveEvenNos.add(8);
        firstFiveEvenNos.add(10);

        Set<Integer> tenEvenNos = new HashSet<>(firstFiveEvenNos);
        System.out.println(tenEvenNos);

        Set<Integer> nextFiveEvenNos = new HashSet<>();
        nextFiveEvenNos.add(12);
        nextFiveEvenNos.add(14);
        nextFiveEvenNos.add(16);
        nextFiveEvenNos.add(18);
        nextFiveEvenNos.add(20);

        tenEvenNos.addAll(nextFiveEvenNos);
        System.out.println(tenEvenNos);

    }
}
