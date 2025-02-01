package Searching.LinearSearch.Java;

public class LinearSearchRecursive {
    public static int linearSearchRecursive(int[] A, int target, int index) {
        if (index >= A.length) {
            return -1;
        }
        if (A[index] == target) {
            return index;
        }
        return linearSearchRecursive(A, target, index + 1);
    }
}