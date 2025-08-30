//Using Xpaths
//Using Selenium:
//Repeat the previous 2 activities, but strictly use xpaths in your locators.

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		
		System.out.println("The page title is: " + driver.getTitle());
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		button.click();
		Thread.sleep(2000);
		String successMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
        System.out.println(successMessage);
		driver.quit();
		
	}

}
