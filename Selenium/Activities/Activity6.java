//Check if elements are selected
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/dynamic-controls
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the checkbox input element.
//Check if the checkbox is selected and print the result.
//Click the checkbox to select it.
//Check if the checkbox is selected again and print the result.
//Close the browser.


package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"checkbox\"]"));
		if(checkbox.isSelected() == true){
			System.out.println("The checkbox is selected");
		}else {
			System.out.println("The checkbox is not selected");
		}
		checkbox.click();
		Thread.sleep(2000);
		if(checkbox.isSelected() == true){
			System.out.println("The checkbox is selected");
		}else {
			System.out.println("The checkbox is not selected");
		}
		driver.quit();
	}

}
