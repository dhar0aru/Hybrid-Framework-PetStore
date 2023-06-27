import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.htmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationWithReports {
    public static void main(String[] args) {
        // Create an ExtentReports instance
        ExtentReports extent = new ExtentReports();
        // Specify the location and name of the report file
        htmlReporter = new HtmlReporter("/HybridPetStoreTest/test-output/report.html");
        extent.attachReporter(htmlReporter);

        // Create a test case in the report
        ExtentTest test = extent.createTest("Website Automation Test", "Verify website functionality");

        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com"); // Replace with the URL of the website you want to automate

        // Perform actions and validations
        test.log(Status.INFO, "Performing actions on the website...");
        // ... perform actions and validations using Selenium WebDriver ...

        // Log test status and details
        test.pass("Test passed");

        // Close the browser
        driver.quit();

        // Flush the report and close ExtentReports
        extent.flush();
        extent.close();
    }
}


