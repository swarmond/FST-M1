# Using Selenium:
# Open a new browser to https:training-support.netwebelementstarget-practice
# Get the title of the page and print it to the console.
# Using xpath:
# Find the 3rd header on the page and print it's text to the console.
# Find the 5th header on the page and print it's color.
# Using any other locator:
# Find the purple button and print all it's classes.
# Find the slate button and print it's text.
# Close the browser.

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/target-practice")
print("Page title is: ", driver.title)

third_heading = driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]")
print("Third heading text is: ", third_heading.text)
fifth_heading_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
print("Fifth heading colour as Hexcode: ", fifth_heading_color.hex)
print("Fifth heading colour as RGB: ", fifth_heading_color.rgb)
purple_button = driver.find_element(By.CSS_SELECTOR, "button.bg-purple-200.text-purple-900")
print("Purple button's classes are: ", purple_button.get_attribute("class"))
slate_button = driver.find_element(By.CSS_SELECTOR, "button.bg-slate-200.text-slate-900")
print("Text in slate button is: ", slate_button.text)
driver.quit()