def linear_search(A, target):
    for i in range(len(A)):
        if A[i] == target:
            return i
    return -1