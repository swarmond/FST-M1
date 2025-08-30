# Dynamic Attributes
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/dynamic-attributes
# Get the title of the page and print it to the console.
# Find the input fields and type in the required data in the fields.
# Wait for success message to appear and print it to the console.
# Close the browser.

# Import webdriver from selenium
from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the input fields
    fullName = driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name')]")
    email = driver.find_element(By.XPATH, "//input[contains(@id, '-email')]")
    eventDate = driver.find_element(By.XPATH, "//input[contains(@name, '-event-date-')]")
    details = driver.find_element(By.XPATH, "//textarea[contains(@id, '-additional-details-')]")
    # Enter the details
    fullName.send_keys("Raiden Shogun")
    sleep(1)
    email.send_keys("raiden@electromail.com")
    sleep(1)
    eventDate.send_keys("2025-06-26")
    sleep(1)
    details.send_keys("It will be electric!")
    sleep(1)
    # Find and click the submit button
    driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    # Wait for the success message and print it
    message = wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation"))).text
    print("Success message: ", message)

    driver.quit()