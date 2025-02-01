# Linear Search

## Introduction

**Linear Search** is one of the simplest searching algorithms. It works by checking each element in a list or array sequentially until the target element is found or all elements have been examined. It can be implemented both iteratively and recursively.

## Algorithm Description

**Linear Search** works by traversing through the array **A** from the beginning, comparing each element with the **target** value. If the element matches the target, the index of that element is returned. If the end of the array is reached without finding the target, the algorithm returns **-1** to indicate that the target is not present in the array.

## Time Complexity

### 1. Iterative & Recursive Linear Search

- **Best Case**: O(1)
  - The best case occurs when the target is found at the first position in the array.
- **Worst Case**: O(n)
  - The worst case happens when the target is not in the array, or it is at the last position.
- **Average Case**: O(n)
  - On average, the algorithm will need to traverse half of the array, making the complexity linear.

## Differences between Iterative and Recursive Implementations

- **Iterative Implementation**:
  - The iterative version of Linear Search uses a loop to iterate through the array.
  - **Space Complexity**: O(1), as it uses constant space.
  - **Memory Usage**: More memory-efficient since it does not require the call stack.
- **Recursive Implementation**:
  - The recursive version uses function calls to check each element.
  - **Space Complexity**: O(n), as each recursive call consumes space on the call stack.
  - **Memory Usage**: Less memory-efficient for large arrays due to deep recursion.

### Conclusion

Linear Search is a simple yet effective algorithm for small datasets or when you do not need to use more advanced algorithms. The iterative version is typically preferred for practical purposes due to its efficiency in space usage, but the recursive version can be useful in teaching and understanding recursion. Both implementations have a time complexity of O(n) in the worst case, and the choice between them largely depends on the specific use case and personal preference.
