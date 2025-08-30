# Tables #1
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/tables
# Get the title of the page and print it to the console.
# Using xpaths on the table:
# Find the number of rows and columns in the table and print them.
# Find and print all the cell values in the third row of the table.
# Find and print the cell value at the second row second column.
# Close the browser.

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/tables")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Print the number of columns
    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th")
    print("Number of columns: ", len(cols))
    # Print the number of rows
    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr")
    print("Number of rows: ", len(rows))

    # Print the cells values of the third row
    thirdRow = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[3]/td")
    print("Third row cell values: ")
    for cell in thirdRow:
        print(cell.text)

    # Print the cell value of the second row and second column
    cellValue = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")
    print("Second row, second cell value: ", cellValue.text)

    driver.quit()