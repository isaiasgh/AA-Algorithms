def linear_search_recursive(A, target, index=0):
    if index >= len(A):
        return -1
    if A[index] == target:
        return index
    return linear_search_recursive(A, target, index + 1)
