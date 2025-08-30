# Clicking a Link
# Using Selenium:
# Open the training support site. (https://training-support.net)
# Print the title of the page
# Click the about us button
# Print the title of the new page

from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By


driver = webdriver.Firefox()
driver.get("https://training-support.net")
print("The page title is: ", driver.title)

driver.find_element(By.LINK_TEXT, "About Us").click()
print("The page title is: ", driver.title)

driver.quit()

    