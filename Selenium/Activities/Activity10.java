//Drag and Drop
//Using Selenium:
//Open a new browser to https://training-support.net/webelements/drag-drop
//Get the title of the page and print it to the console.
//On the page, perform:
	//Find the ball and simulate a click and drag to move it into "Dropzone 1".
	//Verify that the ball has entered Dropzone 1.
	//Once verified, move the ball into "Dropzone 2".
	//Verify that the ball has entered Dropzone 2.
//Close the browser.

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		WebElement football = driver.findElement(By.id("ball"));
		WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(football).moveToElement(dropzone1).pause(3000).release().build().perform();
		if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")){
			System.out.println("The ball is dropped in Drpezone1!");
		}
		
		builder.dragAndDrop(football, dropzone2).pause(3000).build().perform();
		if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")){
			System.out.println("The ball is dropped in Drpezone2!");
		}

		driver.quit();
		
	}

}
