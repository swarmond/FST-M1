# Recursive Adder
# Write a recursive function to calculate the sum of numbers from 0 to 10.

def func_rec(num):
    if(num == 0):
        return 0
    else:
        return num + func_rec(num - 1)
recur = func_rec(10)
print("Sum of numbers: ", recur)