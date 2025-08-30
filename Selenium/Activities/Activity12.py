# Waits #2
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/dynamic-content
# Get the title of the page and print it to the console.
# On the page, perform:
# Find and click the "Click me!" button.
# Wait till the word "release" appears.
# Get the text and print it to console.
# Close the browser.

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-content")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the button and click it
    driver.find_element(By.ID, "genButton").click()
    # Wait for the word to appear
    if wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release")):
        # Print the text to console
        print("Word found: ", driver.find_element(By.ID, "word").text)

    driver.quit()