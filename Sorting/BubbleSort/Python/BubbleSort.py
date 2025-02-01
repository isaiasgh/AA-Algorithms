def BubbleSort (A, n):
    for i in range (n):
        swapped = False
        for j in range (n - i - 1):
            if A [j] < A [j - 1]:
                A [j], A [j - 1] = A [j - 1], A [j]
                swapped = True
        
        if not swapped:
            break