# Input Events #2
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/keyboard-events
# Get the title of the page and print it to the console.
# On the page, type out a string from the Selenium script to show on the page
# Print the message to the console.
# Close the browser.
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/keyboard-events")
print("The title of the page is: ", driver.title)
actions = ActionChains(driver)
actions.send_keys("This is the typed text").perform()
typedtext = driver.find_element(By.XPATH, "//h1[contains(@class,'text-center') and contains(@class,'text-4xl')]").text
print("The entered text is: ", typedtext)
driver.quit()