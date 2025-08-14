# Given a two list of numbers create a new list such that new list should contain only odd numbers
# from the first list and even numbers from the second list.

listOne = list(map(int, input("Enter first list of numbers: ").split(', ')))
listTwo = list(map(int, input("Enter second list of numbers: ").split(', ')))
print("First list is: ", listOne)
print("First list is: ", listTwo)

listFinal = []

for num in listOne:
    if num % 2 != 0:
        listFinal.append(num)

for num in listTwo:
    if num % 2 == 0:
        listFinal.append(num)

print("The produced list is: ", listFinal)