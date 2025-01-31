from Sorting.Quicksort.Partition import Partition

def Quicksort (A, p, r):
    if p < r:
        q = Partition (A, p, r)
        Quicksort (A, p, q - 1)
        Quicksort (A, q + 1, r)