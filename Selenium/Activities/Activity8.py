# Input Events #1
# Using Selenium:
# Open a new browser to https://training-support.net/webelements/mouse-events
# Get the title of the page and print it to the console.
# On the page, perform:
# Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. Print the confirmation text at the end of the sequence.
# Double click on the src button. Then right click on the target button and select open. Print the confirmation text at the end of the sequence.
# Close the browser.
from tokenize import String
from selenium import webdriver
from selenium.webdriver.common.by import By
driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/mouse-events")
print("The title of the page is: ", driver.title)
cargolock = driver.find_element(By.XPATH, "//h1[contains(text(), 'Cargo.lock')]")
cargotoml = driver.find_element(By.XPATH, "//h1[contains(text(), 'Cargo.toml')]")
src = driver.find_element(By.XPATH, "//h1[contains(text(), 'src')]")
target = driver.find_element(By.XPATH, "//h1[contains(text(), 'target')]")
actions = webdriver.ActionChains(driver)
actions.click(cargolock).pause(1).move_to_element(cargotoml).click(cargotoml).pause(1).perform()
confirmmsg = driver.find_element(By.XPATH, "//p[@id=\"result\"]").text
print("The confirmation message is: ", confirmmsg)
actions.move_to_element(src).pause(1).double_click(src).pause(1).move_to_element(target).context_click(target).perform()
openoption = driver.find_element(By.XPATH, "//span[contains(text(), 'Open')]")
actions.click(openoption).pause(1).perform()
finalmsg = driver.find_element(By.XPATH, "//p[@id=\"result\"]").text
print("The final message is: ", finalmsg)
driver.quit()
