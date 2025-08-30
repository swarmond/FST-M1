/*Using Selenium:
Open a new browser to https://training-support.net/webelements/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the checkbox input element.
Check if it is visible on the page.
Click the "Remove Checkbox" button.
Check if it is visible again and print the result.
Close the browser.*/

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: " + pageTitle);
		
		WebElement Checkbox = driver.findElement(By.xpath("//input[@id=\"checkbox\"]"));
		if(Checkbox.isDisplayed() == true) {
		System.out.println("The Checkbox is displayed");
		}else {
			System.out.println("The Checkbox is not displayed");
		}
		
		WebElement ToggleButton = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button"));
		ToggleButton.click();
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id=\"checkbox\"]"));
		if(Checkbox1.isDisplayed() == true) {
			System.out.println("Now, the Checkbox is displayed");
		}else {
			System.out.println("Now, the Checkbox is not displayed");	
		}
		
		driver.quit();
	}

}
