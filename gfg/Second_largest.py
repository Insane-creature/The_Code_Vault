def second_largest(arr):
    first = second = float('-inf')

    if len(arr) < 2:
        return -1
    
    for i in range(len(arr)):
        if arr[i] > first:
            second = first
            first = arr[i]
        elif second > arr[i] and first != second


print(second_largest(arr = [3,5,62,1,8,45]))