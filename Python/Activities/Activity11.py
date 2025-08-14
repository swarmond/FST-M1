# Create a Python dictionary that contains a bunch of fruits and their prices.
# Write a program that checks if a certain fruit is available or not.

fruits = {"Mango": 100, "Lichi": 200, "Banana": 80, "Berry": 150, "Plum": 75}
print("The fruit dictionary contains: ", fruits)
avail_fruit = input("Please enter the fruit you are looking for?: ")
if(avail_fruit in fruits):
    print("{} is available.".format(avail_fruit))
else:
    print("{} is not available.".format(avail_fruit))