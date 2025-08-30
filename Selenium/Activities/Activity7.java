//Check if elements are enabled
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/dynamic-controls
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the text field.
//Check if the text field is enabled and print it.
//Click the "Enable Input" button to enable the input field.
//Check if the text field is enabled again and print it.
//Close the browser.

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		WebElement inputtext = driver.findElement(By.xpath("//input[@id=\"textInput\"]"));
		if(inputtext.isEnabled() == true){
			System.out.println("The Input Text Field is enabled");
		}else {
			System.out.println("The Input Text Field is not enabled");
		}
		WebElement inputbutton = driver.findElement(By.xpath("//button[@id=\"textInputButton\"]"));
		inputbutton.click();
		if(inputtext.isEnabled() == true){
			System.out.println("The Input Text Field is enabled");
		}else {
			System.out.println("The Input Text Field is not enabled");
		}
		driver.quit();
	}

}
