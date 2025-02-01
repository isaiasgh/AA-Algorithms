package Sorting.Quicksort.Java;

public class Quicksort {
    public static void quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = Partition.partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }
}