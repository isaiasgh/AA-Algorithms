from math import floor

def stoogeSort (A, p, r):
    if A[p] > A[r]:
        A[p], A[r] = A[r], A[p]
    
    if (p + 1 < r):
        k = floor ((r - p + 1) / 3)
        stoogeSort (A, p, r - k)
        stoogeSort (A, p + k, r)
        stoogeSort (A, p, r - k)
    
    return A