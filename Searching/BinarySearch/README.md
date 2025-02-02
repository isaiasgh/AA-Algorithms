# Binary Search

## Introduction

The Binary Search algorithm is a highly efficient way to search for an element in a **sorted array** or **list**. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the search continues in the lower half, or if the value is greater, it continues in the upper half. This process repeats until the value is found or the search interval is empty.

This repository contains two implementations of the Binary Search algorithm: one using an **iterative** approach and another using a **recursive** approach. Both implementations are available in **Java** and **Python**.

## Algorithm Description

### 1. Iterative Binary Search

The **iterative** approach uses a loop to repeatedly narrow down the search interval until the target element is found or the interval becomes invalid.

### 2. Recursive Binary Search

The **recursive** approach divides the array into two halves and calls the function recursively on the appropriate half, until the target is found or the search interval becomes invalid.

## Time Complexity

### 1. Iterative & Recursive Binary Search

- **Best Case**: O(1)

  This occurs when the middle element is the target on the first check.

  **Example Input (middle element is the target):**

  ```java
  int target = 10;
  int[] arr = {1, 3, 5, 7, 9, 11, 13};
  ```

- **Average Case**: O(log n)

  The array is halved.

  **Example Input:**

  ```java
  int target = 10;
  int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
  ```

- **Worst Case**: O(log n)

  The algorithm continues halving the array until the target is found or the search space is empty.

  **Example Input (target not in the array):**

  ```java
  int target = 11;
  int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  ```

## Differences between Iterative and Recursive Implementations

- **Memory Usage**: The iterative version uses a constant amount of space (O(1)), as it does not require additional stack frames. The recursive version, on the other hand, uses O(log n) space due to the recursive calls.
- **Performance**: Both versions have the same time complexity, but the iterative version is generally more efficient in terms of memory.
- **Simplicity**: The recursive version may seem more elegant, but it can lead to stack overflow errors if the array is too large. The iterative version avoids this risk.

## Conclusion

Both the **iterative** and **recursive** implementations of the Binary Search algorithm are highly efficient for searching elements in a sorted array, with a time complexity of O(log n). The choice of implementation depends on the specific use case and system constraints.
