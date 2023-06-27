package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;
  
  
  @BeforeMethod
  public void setup() {
	  	WebDriverManager.chromedriver().setup();
	  	driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		String OriginalTitle=driver.getTitle();
		System.out.println("The page title is :"+OriginalTitle);
		Reporter.log("URL has been launched succesfully");		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  //System.out.println("Testing Done");
  }

}
