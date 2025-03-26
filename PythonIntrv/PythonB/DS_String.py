# String
s = "GfG"

# print(s[1])             # access 2nd char
s1 = s + s[0]           # update
# print(s1)               # print

# for x in "banana":
#   print(x, end=" ")

txt = "The best things in life are free!"
# print("free" in txt)

# ---------------------------------------------------
# String Slicing

b = "Hello, World!"
# print(b[2:5])           # b[:5] --> print everything excluding 5th index
# print(b[-5:-2])           # indexing from end starts with -1


# ---------------------------------------------------
 # Modifying the string

# excluding the whitespacde
a = " Anshika Soni"
# print(a.strip()) # returns "Hello, World!" 

# print(a.replace("h", "J"))

# ---------------------------------------------------
# Formating string

# But we can combine strings and numbers by using f-strings or the format() method!
age = 36
txt = f"My name is John, I am {age}"
# print(txt)

price = 59
txt = f"The price is {price:.2f} dollars"
# print(txt)

# ---------------------------------------------------
# FEscaping the characters

txt = "We are the so-called \"Vikings\" from the north."

