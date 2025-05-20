# Nested list comprehension
matrix = [[j for j in range(5)] for i in range(5)]

print(matrix)
# --------------------------------------------------------------------------
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

odd_numbers = [
    element for row in matrix for element in row if element % 2 != 0]

print(odd_numbers)
# --------------------------------------------------------------------------
# 2-D List
matrix = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]

# Nested List Comprehension to flatten a given 2-D matrix
flatten_matrix = [val for sublist in matrix for val in sublist]

print(flatten_matrix)
# --------------------------------------------------------------------------

