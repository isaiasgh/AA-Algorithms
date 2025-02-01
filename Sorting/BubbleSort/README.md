# Bubble Sort

## Introduction

**Bubble Sort** is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted. Despite its simplicity, it is not the most efficient sorting algorithm for large datasets due to its O(n²) time complexity.

## Algorithm Description

The algorithm iterates through the list multiple times. During each iteration, it compares adjacent elements and swaps them if they are in the wrong order. After each full pass through the list, the largest element is "bubbled" to the correct position, hence the name "Bubble Sort." If no elements were swapped during a pass, the algorithm terminates early, indicating that the list is already sorted.

## Time Complexity

- **Best Case**: O(n)  
  The best case occurs when the array is already sorted. In this case, only one pass through the array is needed, and no swaps are made.

  **Example Input (already sorted)**:

  ```java
  int[] arr = {1, 2, 3, 4, 5};
  ```

- **Average Case**: O(n²)  
  In the average case, the algorithm has to go through multiple passes, checking and possibly swapping adjacent elements in every iteration.

  **Example Input (random order)**:

  ```java
  int[] arr = {5, 2, 4, 6, 1, 3};
  ```

- **Worst Case**: O(n²)  
  The worst case occurs when the array is sorted in reverse order. In this case, every pair of adjacent elements must be swapped in each pass, requiring the maximum number of comparisons and swaps.

  **Example Input (reverse order)**:

  ```java
  int[] arr = {5, 4, 3, 2, 1};
  ```

## Conclusion

Bubble Sort is a simple, easy-to-understand algorithm, but its O(n²) time complexity makes it inefficient for larger datasets. Although it is often used for educational purposes to introduce sorting algorithms, it is rarely used in practice for large-scale applications where more efficient algorithms like QuickSort or MergeSort are preferred.
