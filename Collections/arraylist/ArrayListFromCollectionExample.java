package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNos = new ArrayList<>();
        firstFivePrimeNos.add(2);
        firstFivePrimeNos.add(3);
        firstFivePrimeNos.add(5);
        firstFivePrimeNos.add(7);
        firstFivePrimeNos.add(11);

        List<Integer> firstTenPrimeNos = new ArrayList<>(firstFivePrimeNos);
        List<Integer> nextFivePrimeNos = new ArrayList<>();
        nextFivePrimeNos.add(13);
        nextFivePrimeNos.add(17);
        nextFivePrimeNos.add(19);
        nextFivePrimeNos.add(23);
        nextFivePrimeNos.add(29);

        firstTenPrimeNos.addAll(nextFivePrimeNos);
        System.out.println(firstTenPrimeNos);
        firstTenPrimeNos.add(31);
        System.out.println(firstTenPrimeNos);

    }
}
