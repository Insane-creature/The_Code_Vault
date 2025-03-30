def swap_case(s):
    new_s = []
    for i in s:
        if i.isupper():
            new_s.append(i.lower())
        elif i.islower():
            new_s.append(i.upper())
        else:
            new_s.append(i)

    return "".join(new_s) 
        
print(swap_case(s="AnshiKA"))
