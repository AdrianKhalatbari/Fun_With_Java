package test;

public class BinarySearch {
    public static int binarySearch(int start, int end, int key) {
        while (end >= start) {
            int mid = (start + end) / 2;
            if (mid == key) {
                return 1;
            } else if (mid >= key) {
                end = mid;
            } else start = mid;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int start, int end, int key) {
        while ((end - start) > 1) {
            int mid = (start + end) / 2;
            if (mid > key) {
                end = mid;
                recursiveBinarySearch(start, end, key);
            } else if (mid < key) {
                start = mid;
                recursiveBinarySearch(start, end, key);
            } else return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int output = binarySearch(1, 100, 11);
        int output = recursiveBinarySearch(1, 100, 5);
        if (output == 1) {
            System.out.println("True");
        } else System.out.println("False");
    }


}
