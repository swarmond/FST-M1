/*Using Selenium:
Open a new browser to https://training-support.net/webelements/target-practice
Get the title of the page and print it to the console.
Using xpath:
Find the 3rd header on the page and print it's text to the console.
Find the 5th header on the page and print it's color.
Using any other locator:
Find the purple button and print all it's classes.
Find the slate button and print it's text.
Close the browser.*/

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Page Title is: " + driver.getTitle());
		
		String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
		System.out.println("Third header's text is: " + thirdHeaderText);
		
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		System.out.println("Colour as RGB: " + fifthHeaderColor.asRgb());
		System.out.println("Colour as HexCode: " + fifthHeaderColor.asHex());
		
		// Find the purple button and print its classes
        String purpleButtonClass = driver.findElement(By.cssSelector("button.bg-purple-200.text-purple-900")).getDomAttribute("class");
        System.out.println("Purple button's classes are " + purpleButtonClass);
        // Find the slate button and print its text
        String slateButtonText = driver.findElement(By.cssSelector("button.bg-slate-200.text-slate-900")).getText();
        System.out.println("Slate button's text is " + slateButtonText);

        // Close the browser
        driver.quit();
    }

}
