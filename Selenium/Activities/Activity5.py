# Using Selenium:
# Open a new browser to https://training-support.netwebelementsdynamic-controls
# Get the title of the page and print it to the console.
# On the page, perform:
# Find the checkbox input element.
# Check if it is visible on the page.
# Click the "Remove Checkbox" button.
# Check if it is visible again and print the result.
# Close the browser.

from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-controls")
print("The title of the page is: ", driver.title)
checkbox = driver.find_element(By.XPATH, "//input[@id=\"checkbox\"]")
sleep(2)
if(checkbox.is_displayed() == True):
    print("The checkbox is displayed")
else:
    print("The checkbox is not displayed")
removeCheckbox = driver.find_element(By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/section[1]/button")
removeCheckbox.click()
if(checkbox.is_displayed() == True):
    print("The checkbox is displayed")
else:
    print("The checkbox is not displayed")

driver.quit()