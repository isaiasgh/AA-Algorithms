# Insertion Sort

## Introduction

**Insertion Sort** is a simple sorting algorithm that builds the final sorted array one item at a time. It is much like sorting playing cards in your hands. It picks the next item from the unsorted portion of the array and places it in the correct position within the sorted portion. It’s efficient for small datasets, but not suitable for larger datasets due to its O(n²) time complexity.

## Algorithm Description

The algorithm iterates through the list, starting from the second element. For each element, it compares it with the elements before it, moving the larger elements one position to the right to make space for the current element. Once the correct position is found, the element is inserted into the sorted part of the array. This process is repeated for each element in the array.

## Time Complexity

- **Best Case**: O(n)

  The best case occurs when the array is already sorted. In this case, no elements need to be moved, and only one comparison per element is needed, resulting in linear time complexity.

  **Example Input (already sorted)**:

  ```java
  int[] arr = {1, 2, 3, 4, 5};
  ```

- **Average Case**: O(n²)  
  In the average case, the algorithm has to perform multiple comparisons and shifts for each element, leading to quadratic time complexity.

  **Example Input (random order)**:

  ```java
  int[] arr = {5, 2, 4, 6, 1, 3};
  ```

- **Worst Case**: O(n²)  
  The worst case occurs when the array is sorted in reverse order. In this case, each element must be compared and shifted to the beginning of the sorted section, resulting in the maximum number of comparisons and shifts.

  **Example Input (reverse order)**:

  ```java
  int[] arr = {5, 4, 3, 2, 1};
  ```

## Conclusion

Insertion Sort is a simple and efficient algorithm for small datasets or nearly sorted data, but its O(n²) time complexity makes it impractical for larger datasets. It is often used in practice for small lists or as part of more advanced algorithms like Hybrid Sorts.
