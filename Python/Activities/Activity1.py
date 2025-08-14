# Using Python:
# Write a program that asks the user to enter their name and their age.
# Print out a message addressed to them that tells them the year that they will turn 100 years old.

# Take user's name and age
name = input("Enter name: ")
age = int(input("Enter age: "))

# Calculate the year they turn 100
year_turn_100 = 2025 + (100 - age)
print(name + " will turn of age 100 in {}" + format(year_turn_100))