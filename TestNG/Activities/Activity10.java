/*Create an excel sheet with the following dataset included in it:
Full Name		Email					Date		Details
Satvik Shah	    satshah@example.com	    2025-01-26	Republic Day
Avinash Kati	avinashK@example.com	2025-04-05	Birthday
Lahri Rath	    lahri.rath@example.com	2025-10-15	Holiday
Use the Apache POI to read the data from the excel file into a DataProvider.
Use the data from the DataProvider to test the Simple form page.
Open the browser and navigate to https://training-support.net/webelements/simple-form.
Fill in the form with the data retrieved.
Read the alert message after submitted the form.
Close the browser.*/

package activities;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {
	WebDriver driver;
    WebDriverWait wait;
 
    @BeforeMethod
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        // Open browser
        driver.get("https://training-support.net/webelements/simple-form");
    }
 
    public static List<List<String>> readExcel(String filePath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filePath);
 
            try (// Create Workbook instance holding reference to Excel file
			XSSFWorkbook workbook = new XSSFWorkbook(file)) {
				// Get first sheet from the workbook
				XSSFSheet sheet = workbook.getSheetAt(0);
				DataFormatter formatter = new DataFormatter();
 
				// Iterate through each rows one by one
				for (Row row : sheet) {
				    List<String> rowData = new ArrayList<>();
				    for (Cell cell : row) {
				        String value;
				        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
				            // Force dd-MM-yyyy format for dates
				            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				            value = sdf.format(cell.getDateCellValue());
				        } else {
				            value = formatter.formatCellValue(cell);
				        }
				        rowData.add(value);
				    }
				    data.add(rowData);
				}
			}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
 
    @DataProvider(name = "Events")
    public static Object[][] signUpInfo() {
        String filePath = "C:/Users/SwarnavMondal/eclipse-workspace/FST_TestNG/src/test/resources/TestNG_Activity10_DataProvider.xlsx";
        List<List<String>> data = readExcel(filePath);
        Object[][] result = new Object[data.size() - 1][1];
        for (int i = 1; i < data.size(); i++) {
            result[i - 1][0] = data.get(i);
        }
        return result;
    }
 
    @Test(dataProvider = "Events")
    public void registerTest(List<String> rows) throws InterruptedException {
        // Find the input fields and enter text
    	WebElement fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("full-name")));
    	fullName.sendKeys(rows.get(0));
        // Enter the email
    	WebElement fullEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
    	fullEmail.sendKeys(rows.get(1));
        
        // Enter the Date of the event as separate day, month, year
    	// Enter the Date of the event (use JS to set ISO format yyyy-MM-dd)
        WebElement dateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("event-date")));
        String date = rows.get(2); // Example: "15-10-2025"

        // Convert dd-MM-yyyy → yyyy-MM-dd
        String[] parts = date.split("-");
        String formattedDate = parts[2] + "-" + parts[1] + "-" + parts[0]; // "2025-10-15"

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));",
            dateField,
            formattedDate
        );
        
        // Enter additional details
        WebElement addiDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("additional-details")));
        addiDetails.sendKeys(rows.get(3));
        
        // Click Submit
        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Submit']")));
        submit.click();
        
        // Confirm booking
        WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String message = confirmation.getText();
        assertEquals(message, "Your event has been scheduled!");
         
        // Refresh the page
        driver.navigate().refresh();
    }
 
    @AfterMethod
    public void tearDown() {
        // Close the browser
    	if (driver != null) {
            driver.quit();
        }
    }

}
