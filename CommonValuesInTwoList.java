package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohammad Mahdi
 */
public class CommonValuesInTwoList {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(8);
        firstList.add(99);
        secondList.add(1);
        secondList.add(6);
        secondList.add(3);
        secondList.add(2);
        secondList.add(7);
        List<Integer> finalList = new ArrayList<Integer>(secondList);
        finalList.retainAll(firstList);
        System.out.println(finalList);
    }
}
