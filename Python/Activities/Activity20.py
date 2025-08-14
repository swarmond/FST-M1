# Reading Excel Files
# Using Pandas:
# Use pandas to read data the Excel file
# Print the number of rows and columns
# Print the data in the emails column only
# Sort the data based on FirstName in ascending order and print the data
# Hint: You can use DataFrame.shape to get the number of rows and columns

import pandas

dataframe = pandas.read_excel("Employee.xlsx")
row_col_num = dataframe.shape
print("Total number of rows and columns are: ", row_col_num)
print("Data in Email column are:\n", dataframe['EmailID'])
print("FirstNames in ascending order are:\n ", dataframe.sort_values('FirstName'))