package testCase;

import org.testng.annotations.Test;
import base.Base;
import objects.HomePageObjects;
import objects.LoginPageObjects;
import utility.TestDataFile;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Base{
	
	@DataProvider
	  public Object[][] getTestData() 
		  { Object data[][]=TestDataFile.getTestData("Sheet1");
		  	return data;	  
		  }
	
		@Test(priority=1)
		public void verifyLoginWithValidCredentials() throws InterruptedException {
			
			LoginPageObjects login = new LoginPageObjects(driver);

		    HomePageObjects home = new HomePageObjects(driver);
		       

		   // driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();

		       
		     home.clickSignInBtn();
			
		     login.enterUserName("Meghna0604");
		     
		     login.enterPassword("1234");
		     
		     login.clickLoginBtn();
			
			//WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
			//UserName.sendKeys();
	        
	        //WebElement Password = driver.findElement(By.xpath("//input[@name='password' and @type='password' and @value='j2ee']"));
	        //Password.sendKeys("1234");
	        
	        //driver.findElement(By.xpath("//input[@name='signon' and @type='submit' and @value='Login']")).click();
	        
	        Thread.sleep(3000);
	        
	        if(driver.getPageSource().contains("Welcome Meghna!")){
				  System.out.println("Login Successful!");
				  
	        }
	        
	   
		}   
		
		@Test(priority=2)
		public void verifyLoginWithInvalidCredentials() throws InterruptedException {
			
	        LoginPageObjects login = new LoginPageObjects(driver);

		    HomePageObjects home = new HomePageObjects(driver);
		       

		   // driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();

		       
		     home.clickSignInBtn();
			
		     login.enterUserName("Tara1234");
		     
		     login.enterPassword("Tommy@1234");
		     
		     login.clickLoginBtn();
	        
		     Thread.sleep(3000);
	        if(driver.getPageSource().contains("Invalid username or password.  Signon failed.")){
				  System.out.println("Login Failed!");
				  
	        }
	        
		}
}
