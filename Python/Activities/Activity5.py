# Using Python Loops:
# Write a Python program to create the multiplication table (from 1 to 10) of a number.

number = int(input("Enter a number: "))
for i in range(1, 1100):
    print(number, 'x', i, '=', number*i)