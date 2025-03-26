# Creating the list
a = [10, 20, "GfG", 40, True]

a = list((1, 2, 3, 'apple', 4.5))  

# Create a list [2, 2, 2, 2, 2]
a = [2] * 5

# ---------------------------------------------------
# Adding Elements

# append(): Adds an element at the end of the list.
# extend(): Adds multiple elements to the end of the list.
# insert(): Adds an element at a specific position.

# Initialize an empty list
a = []

# Adding 10 to end of list
a.append(10)  

# Inserting 5 at index 0
a.insert(0, 5)
a.extend([15, 20, 25])  
print("After extend([15, 20, 25]):", a) 
