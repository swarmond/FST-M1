# Check if elements are selected
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/dynamic-controls
# Get the title of the page and print it to the console.
# On the page, perform:
# Find the checkbox input element.
# Check if the checkbox is selected and print the result.
# Click the checkbox to select it.
# Check if the checkbox is selected again and print the result.
# Close the browser.
from selenium import webdriver
from selenium.webdriver.common.by import By
driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-controls")
print("The title of the page is: ", driver.title)
checkbox = driver.find_element(By.XPATH, "//input[@id=\"checkbox\"]")
if(checkbox.is_selected() == True):
    print("The checkbox is selected")
else:
    print("The checkbox is not selected")
checkbox.click()
if(checkbox.is_selected() == True):
    print("The checkbox is selected")
else:
    print("The checkbox is not selected")
driver.quit()