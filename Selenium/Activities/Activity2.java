//Sending Input
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/login-form/
//Get the title of the page and print it to the console.
//Find the username field using any locator and enter "admin" into it.
//Find the password field using any locator and enter "password" into it.
//Find the "Log in" button using any locator and click it.
//Close the browser.

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		
		System.out.println("The page title is: " + driver.getTitle());
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		button.click();
		Thread.sleep(5000);
		String successMessage = driver.findElement(By.tagName("h1")).getText();
        System.out.println(successMessage);
		driver.quit();
		
	}

}
