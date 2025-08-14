# Using Python:
# Ask the user for a number.
# Depending on what number they enter, tell them if the number is an even or odd number.

# Ask the user for a number.
number = int(input("Think of a number: "))
mod = number % 2
# Depending on what number they enter, tell them if the number is an even or odd number.
if mod > 0:
    print("{} is an odd number".format(number))
else:
    print("{} is an even number".format(number))