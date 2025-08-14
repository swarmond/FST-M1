# Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5.
# Bonus points if you can make the user enter their own tuple.

# cityTuple = ("Boston", "Northampton", "Mumbai", "Prague")
# print("Entered Tuple is: ", cityTuple)

numberTuple = (12, 20, 35, 47, 50, 64)
print("Entered numbers in the Tuple is: ", numberTuple)

for num in numberTuple:
    if num % 5 == 0:
        print("The numbers in the Tuple divisible by 5 is: ", num)
