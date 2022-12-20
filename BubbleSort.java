package test;

public class BubbleSort {
    public static int[] bubbleSort(int[] list1) {
        int x = 0;
        int listLength = list1.length;
        while (x <= listLength) {
            for (int i = 0; i < (listLength-1); i++) {
                if (list1[i] > list1[i + 1]) {
                    int temp = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = temp;
                }
            }
            x++;
        }
        return list1;
    }

    public static void main(String[] args) {
        int[] list = {5, 3, 8, 6, 7, 2};
        int[] sortedList = bubbleSort(list);
        for (int i : sortedList) {
            System.out.print(i + " ");
        }
    }
}
