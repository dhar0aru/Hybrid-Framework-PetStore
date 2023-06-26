package testCase;

import org.testng.annotations.Test;

import base.Base;
import objects.HomePageObjects;
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
  @Test(priority=0,dataProvider="getTestData")
  public void IncorrectPassword(String email, String password) {
	  HomePageObjects login=new HomePageObjects(driver);
	  
	  login.enterEmailLogin(email);
	  login.enterPasswordLogin("3421");
	  login.clickLoginInButton();
	  
	  String currentUrl=driver.getCurrentUrl();
	  if(currentUrl.equals("https://www.pothys.com/login"))
	  {
		  System.out.println("Login Failed");
		  Reporter.log("LogIn Account failed because of Incorrect Password");
	  }
  }
  
  @Test(priority=1,dataProvider="getTestData")
  public void login(String email,String password)
  {
	  HomePageObjects login=new HomePageObjects(driver);
	  
	  login.enterEmailLogin(email);
	  login.enterPasswordLogin(password);
	  login.clickLoginInButton();
	  
	  String currentUrl=driver.getCurrentUrl();
	  if(currentUrl.equals("https://www.pothys.com/"))
	  {
		 System.out.println("Login Succeeded");
		 Reporter.log("Login Account Success");
	  }
  }
}
  
