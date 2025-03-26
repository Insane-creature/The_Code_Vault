def reverseArray(arr):
    reversed_arr = []
    for i in range(len(arr) - 1, -1, -1):  # Looping from last index to 0
        reversed_arr.append(arr[i])
    return reversed_arr


print(reverseArray(arr = [1,2,3,4]))