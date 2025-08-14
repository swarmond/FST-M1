# Adding List Numbers
# Write a function sum() such that it can accept a list of elements and print the sum of all elements.

def func_sum(num):
    sum = 0
    for number in num:
        sum += number
    return sum
num_list = [10, 20, 30, 40, 50]

sum_res = func_sum(num_list)

print("Sum of all elements is: ", sum_res)