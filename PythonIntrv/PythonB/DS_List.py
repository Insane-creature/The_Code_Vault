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

my_list = a

# Adding Elements
a.append(4)        # Adds to end
a.insert(1, 10)    # Inserts at index
a.extend([5, 6])   # Adds multiple elements

# Removing Elements
my_list.remove(2)        # Removes first occurrence of 2
my_list.pop()            # Removes last element
my_list.pop(1)           # Removes element at index
del my_list[0]           # Deletes by index
my_list.clear()          # Empties the list

# Updating Elements
my_list[1] = 20
my_list[2:4] = [30, 40]

# Searching & Checking
2 in my_list             # Checks existence
my_list.index(3)         # Index of first occurrence
my_list.count(2)         # Count of value

# Sorting & Searching
my_list.sort()           # Sorts in-place
my_list.sort(reverse=True)
sorted_list = sorted(my_list)    # Returns new sorted list
my_list.reverse()        # Reverses in-place

# Copying
copy_list = my_list.copy()         # Shallow copy
copy_list = list(my_list)          # Another way

