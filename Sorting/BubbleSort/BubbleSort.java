public class BubbleSort {
    public static void bubbleSort(int[] A) {
        int n = A.length;
        boolean swapped;
        
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i; j++) {
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
