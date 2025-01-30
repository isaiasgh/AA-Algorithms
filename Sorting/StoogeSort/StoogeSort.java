import java.util.Arrays;

public class StoogeSort {
    public static void stoogeSort(int[] A, int p, int r) {
        if (A[p] > A[r]) {
            int temp = A[p];
            A[p] = A[r];
            A[r] = temp;
        }
        
        if (p + 1 < r) {
            int k = (r - p + 1) / 3;
            stoogeSort(A, p, r - k);
            stoogeSort(A, p + k, r);
            stoogeSort(A, p, r - k);
        }
    }
}
