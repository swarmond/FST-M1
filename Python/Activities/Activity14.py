# Fibonacci Numbers:
# Using Recursion:
# Write a program that asks the user how many Fibonnaci numbers to generate and then generates them. 
# Hint: The Fibonnaci seqence is a sequence of numbers where the next number in the sequence is the sum of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …

def func_fibn(num):
    if num <= 1:
        return 1
    else:
        return (func_fibn(num - 1) + func_fibn(num - 2))
    
fibn_num = int(input("Enter how many Fibonacci nnumbers to generate: "))

print("The Fibonacci numbers are: ")
for i in range(fibn_num):
    print(func_fibn(i))