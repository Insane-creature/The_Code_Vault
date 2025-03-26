def pushZerosToEnd(arr):
    new_array = []
    len_arr = len(arr)
    for i in range(len(arr)):
        if arr[i] != 0:
            new_array.append(arr[i])
    len_arr_new = len(new_array)
    diff = len_arr - len_arr_new

    new_array.extend([0] * diff)
    return new_array


print(pushZerosToEnd(arr=[3,5,0,0,4]))


