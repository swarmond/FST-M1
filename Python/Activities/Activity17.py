# Writing CSV Files.
# Using Pandas:
# Write the following data into a CSV file.
# Usernames	Passwords
# admin	password
# Charles	Charl13
# Deku	AllMight

import pandas

data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("Sample.csv", index=False)