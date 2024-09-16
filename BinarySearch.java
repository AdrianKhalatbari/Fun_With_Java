package test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> list, int key) {
        int start = 0;
        int end = list.size() - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (list.get(mid) < key) {
                start = mid + 1;
            } else if (list.get(mid) > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(List<Integer> list, int key) {
        int start = 0;
        int end = list.size() - 1;
        while ((end - start) > 1) {
            int mid = (start + end) / 2;
            if (list.get(mid) > key) {
                end = mid;
                List<Integer> newList = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    newList.add(list.get(i));
                }
                recursiveBinarySearch(newList, key);
            } else if (list.get(mid) < key) {
                start = mid;
                List<Integer> newList = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    newList.add(list.get(i));
                }
                recursiveBinarySearch(newList, key);
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {12, 24, 39, 43, 50, 106, 110};
        List<Integer> integerList = new ArrayList<>();
        for (int i : list) {
            integerList.add(i);
        }
        ////////////////////////////////// Test main method
       int output = binarySearch(integerList, 24);
        ////////////////////////////////// Test Recursive method
        // int output = recursiveBinarySearch(integerList, 43);
        if (output != -1) {
            System.out.println("The result is in index: " + output);
        } else System.out.println("The element is not in list!");
    }
}
