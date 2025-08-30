# Using Xpaths
# Using Selenium:
# Repeat the previous 2 activities, but strictly use xpaths in your locators.

from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https:training-support.net/webelements/login-form/")
print("The page title is: ", driver.title)
username = driver.find_element(By.XPATH, "//input[@id='username']")
username.send_keys("admin")
password = driver.find_element(By.XPATH, "//input[@id='password']")
password.send_keys("password")
loginButton = driver.find_element(By.XPATH, "//button[text()='Submit']")
loginButton.click()
sleep(2)
message = driver.find_element(By.XPATH, "//h1[contains(text(), 'Success')]")
print("Login message: ", message.text)
driver.quit()