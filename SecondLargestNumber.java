package test;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4,5};
        Arrays.sort(array);
        int j = 0;
        int index = array.length-1;
        System.out.println(array[index-1]);
    }
}
