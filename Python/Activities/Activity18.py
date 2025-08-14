# Reading CSV Files
# Using Pandas:
# Read the CSV made in the previous program:
# Print the values only in the Usernames column
# Print the username and password of the second row
# Sort the Usernames column data in ascending order and print data
# Sort the Passwords column in descending order and print data
# Hint: You can use DataFrame.sort_values("column") to sort your data
# Hint: You can use DataFrame.sort_values("column", ascending=false) to sort your data in descending order.

import pandas

dataframe = pandas.read_csv('Sample.csv')
print(dataframe)
print(dataframe["Usernames"])
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])
asc_sorted_data = dataframe.sort_values("Usernames")
print("Ascending Sorted Usernames: ", asc_sorted_data)
desc_sorted_data = dataframe.sort_values("Passwords", ascending=False)
print("Descending Sorted Passwords: ", desc_sorted_data)