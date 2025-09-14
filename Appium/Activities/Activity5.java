package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity5 {
	
	AppiumDriver driver;
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		// define the capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.messaging");
		options.setAppActivity(".ui.ConversationListActivity");

		options.noReset();

		// set the appium server url
		URL serverurl = new URI("http://localhost:4723").toURL();

		// initialize the driver
		driver = new AndroidDriver(serverurl, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	public void sendMessagesTest() {
		driver.findElement(AppiumBy.accessibilityId("Messages")).click();
		driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("7811099106");
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='ContactSuggestionList']/android.view.View")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("compose_message_text")));
		driver.findElement(AppiumBy.id("compose_message_text")).sendKeys("Hello from Appium");
		driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
		
		String messageText = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id='message_text']"))).getText();

		System.out.println(messageText);
		Assert.assertEquals(messageText, "Hello from Appium");
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
