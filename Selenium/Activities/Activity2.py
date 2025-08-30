# Sending Input
# Using Selenium:
# Open a new browser to https:training-support.net/webelements/login-form/
# Get the title of the page and print it to the console.
# Find the username field using any locator and enter "admin" into it.
# Find the password field using any locator and enter "password" into it.
# Find the "Log in" button using any locator and click it.
# Close the browser.

from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https:training-support.net/webelements/login-form/")
print("The page title is: ", driver.title)
username = driver.find_element(By.ID, "username")
username.send_keys("admin")
password = driver.find_element(By.ID, "password")
password.send_keys("password")
loginButton = driver.find_element(By.XPATH, "//button[text()='Submit']")
loginButton.click()
sleep(5)
message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
print("Login message: ", message.text)
driver.quit()
