# Check if elements are enabled
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/dynamic-controls
# Get the title of the page and print it to the console.
# On the page, perform:
# Find the text field.
# Check if the text field is enabled and print it.
# Click the "Enable Input" button to enable the input field.
# Check if the text field is enabled again and print it.
# Close the browser.
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-controls")
print("The title of the page is: ", driver.title)
inputtext = driver.find_element(By.XPATH, "//input[@id=\"textInput\"]")
if(inputtext.is_enabled() == True):
    print("The Input Text Field is enabled")
else:
    print("The Input Text Field is not enabled")
inputbutton = driver.find_element(By.XPATH, "//button[@id=\"textInputButton\"]")
inputbutton.click()
if(inputtext.is_enabled() == True):
    print("The Input Text Field is enabled")
else:
    print("The Input Text Field is not enabled")

driver.quit()