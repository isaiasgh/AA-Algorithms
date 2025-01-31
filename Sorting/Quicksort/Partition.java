package Sorting.Quicksort;

public class Partition {
    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1;
    }
}