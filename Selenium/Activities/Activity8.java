//Input Events #1
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/mouse-events
//Get the title of the page and print it to the console.
//On the page, perform:
//Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. Print the confirmation text at the end of the sequence.
//Double click on the src button. Then right click on the target button and select open. Print the confirmation text at the end of the sequence.
//Close the browser.

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of the page is: " + driver.getTitle());
		WebElement cargolock = driver.findElement(By.xpath("//h1[contains(text(), 'Cargo.lock')]"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[contains(text(), 'Cargo.toml')]"));
		WebElement src = driver.findElement(By.xpath("//h1[contains(text(), 'src')]"));
		WebElement target = driver.findElement(By.xpath("//h1[contains(text(), 'target')]"));
		Actions builder = new Actions(driver);
		builder.click(cargolock).pause(1000).moveToElement(cargoToml).pause(1000).click(cargoToml).build().perform();
		String confirmmessage = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println("The confirmation message is: " + confirmmessage);
		builder.moveToElement(src).pause(1000).doubleClick(src).pause(1000).moveToElement(target).contextClick(target).build().perform();
		WebElement openoption = driver.findElement(By.xpath("//span[contains(text(), 'Open')]"));
		builder.click(openoption).pause(1000).build().perform();
		String actionmessage = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println("The final message is: " + actionmessage);
		driver.quit();
	}

}
