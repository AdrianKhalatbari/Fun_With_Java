import java.util.Arrays;

public class ParallelArraySorting {

    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.parallelSort(arr, 0, 4);
        System.out.println("Four first element sort= " + Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Full Array Sorting= " + Arrays.toString(arr));
    }
}
