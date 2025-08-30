//Input Events #2
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/keyboard-events
//Get the title of the page and print it to the console.
//On the page, type out a string from the Selenium script to show on the page
//Print the message to the console.
//Close the browser.

package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		Actions builder = new Actions(driver);
		builder.sendKeys("This is the typed text").perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String typetext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'text-center') and contains(@class,'text-4xl')]"))).getText();
		System.out.println(typetext);
		
		driver.quit();
		
	}

}
