# Stooge Sort

## Introduction

**Stooge Sort** is a highly inefficient sorting algorithm that works by recursively sorting the first two-thirds, the last two-thirds, and the first two-thirds again of the array. While it is a valid sorting algorithm, it is rarely, if ever, used in practice due to its poor time complexity. Stooge Sort is primarily studied in academic settings as an example of a highly inefficient algorithm.

## Algorithm Description

Stooge Sort follows a recursive approach with the following steps:

1. If the first element is greater than the last element, swap them.
2. If the size of the sub-array is greater than 1, divide the array into three parts:
   - Sort the first two-thirds of the array.
   - Sort the last two-thirds of the array.
   - Sort the first two-thirds of the array again.

This process continues recursively until the array is sorted. However, this algorithm has a very high number of comparisons and swaps, leading to very poor performance.

## Time Complexity

- **Best Case**: O(n^(log 3 / log 1.5)) ≈ O(n^2.709)

  Even in the best case, Stooge Sort has an unusually high time complexity compared to other sorting algorithms. The best case still requires a significant number of recursive calls and comparisons.

  **Example Input (array already sorted)**:

  ```java
  int[] arr = {1, 2, 3, 4, 5};  // Array is already sorted, but Stooge Sort will still perform multiple comparisons
  ```

- **Average Case**: O(n^2.709)

  The average case for Stooge Sort still results in a very high time complexity due to the repetitive recursive sorting and unnecessary comparisons. This makes it far less efficient than other algorithms like QuickSort or MergeSort.

  **Example Input (random order)**:

  ```java
  int[] arr = {5, 4, 3, 2, 1};  // Stooge Sort will take more time than necessary for sorting this random array
  ```

- **Worst Case**: O(n^2.709)

  The worst-case scenario occurs when the array is in reverse order, and Stooge Sort still performs an excessive number of operations, making it impractical for use in real-world applications.

  **Example Input (reverse sorted array)**:

  ```java
  int[] arr = {5, 4, 3, 2, 1};  // Reverse sorted array requires the maximum number of operations
  ```

## Conclusion

**Stooge Sort** is a classic example of an inefficient sorting algorithm, rarely used outside of academic contexts. Its time complexity, O(n^2.709) in the best, average, and worst cases, makes it much slower than other sorting algorithms like QuickSort, MergeSort, or even Bubble Sort. As such, Stooge Sort is not practical for use in real-world applications and is generally studied for educational purposes to demonstrate the impact of algorithmic inefficiency.
