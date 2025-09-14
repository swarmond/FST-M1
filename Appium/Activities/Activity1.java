package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	
		AppiumDriver driver;
		WebDriverWait wait;
		
		// Setup function for Android
		@BeforeClass
		public void androidsetup() throws MalformedURLException, URISyntaxException {
			// Define the capabilities
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("android");
			options.setAutomationName("UiAutomator2");
			
			// Only for Android if the .apk file is provided
			options.setApp("C:/Users/SwarnavMondal/OneDrive - IBM/Desktop/FST/FST_Appium/Calculator.apk");
			options.noReset();
			
			// Only for Android if the .apk file not provided
//			options.setAppPackage("com.google.android.calculator");
//			options.setAppActivity("com.android.calculator2.Calculator");
			
			// Set the Appium server URL
			URL serverUrl = new URI("http://localhost:4723").toURL();
			
			// Initialize the driver
			driver = new AndroidDriver(serverUrl, options);
			
		}
		
		@Test
		public void multiplyTest() {
			// Find and tap the number 5
			driver.findElement(AppiumBy.id("digit_5")).click();
			// Find and tap the multiply button
			driver.findElement(AppiumBy.accessibilityId("multiply")).click();
			// Find and tap the number 6
			driver.findElement(AppiumBy.id("digit_6")).click();
			// Find and tap the equals button
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			// Find the result and assert
			String result = driver.findElement(AppiumBy.id("result_final")).getText();
			assertEquals(result, "30");
		}
		
		
		@AfterClass
		public void teardown() {
			driver.quit();
		}

}
