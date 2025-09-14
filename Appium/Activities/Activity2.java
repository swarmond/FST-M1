package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
	
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
//		options.setApp("C:/Users/SwarnavMondal/OneDrive - IBM/Desktop/FST/FST_Appium/Calculator.apk");
		options.noReset();
		
		// Only for Android if the .apk file not provided
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		
		// Set the Appium server URL
		URL serverUrl = new URI("http://localhost:4723").toURL();
		
		// Initialize the driver
		driver = new AndroidDriver(serverUrl, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	@Test
	public void aboutUs() {
		driver.get("https://training-support.net");
		
		String heading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
		System.out.println(heading);
		
		driver.findElement(AppiumBy.accessibilityId("About Us")).click();
		String newHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"About Us\"]")).getText();
		System.out.println(newHeading);
		
	}

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
