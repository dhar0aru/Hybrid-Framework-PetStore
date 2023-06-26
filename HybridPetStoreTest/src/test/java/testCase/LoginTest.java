package testCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.Base;
import base.Base;
import objects.HomePageObjects;
import utility.TestDataFile;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Base{
	
	@DataProvider
	  public Object[][] getTestData() 
		  { Object data[][]=TestDataFile.getTestData("Sheet1");
		  	return data;	  
		  }
	public class Login extends Base {
		@Test(priority=1)
		public void verifyLoginWithValidCredentials() {
			
			driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
			
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();

			
			WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
	        Username.sendKeys("Tara1234");
	        
	        WebElement Password = driver.findElement(By.xpath("//input[@name='password' and @type='password' and @value='j2ee']"));
	        Password.sendKeys("Tommy#1234");
	        
	        driver.findElement(By.xpath("//input[@name='signon' and @type='submit' and @value='Login']")).click();
	        
		}
		
		@Test(priority=2)
		public void verifyLoginWithInvalidCredentials() {
			
			driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
			
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();

			
			WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
	        Username.sendKeys("Tara1234");
	        
	        WebElement Password = driver.findElement(By.xpath("//input[@name='password' and @type='password' and @value='j2ee']"));
	        Password.sendKeys("Tommy@1234");
	        
	        driver.findElement(By.xpath("//input[@name='signon' and @type='submit' and @value='Login']")).click();
	        
	        driver.findElement(By.className("messages")).isDisplayed();
		}
}
}