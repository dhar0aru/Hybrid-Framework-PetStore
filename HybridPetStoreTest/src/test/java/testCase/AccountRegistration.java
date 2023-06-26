package testCase;
import objects.HomePageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Base;

import utility.TestDataFile;

public class AccountRegistration extends Base {
	
  
   @DataProvider
  public Object[][] getTestData() 
	  { Object data[][]=TestDataFile.getTestData("Sheet1");
	  	return data;	  
	  }
  @Test(priority=0)
  public void registerUser() {
	  HomePageObjects HO=new HomePageObjects(driver);
	  
	  HO.clickBirdsImglink();
//	  createAccount.enterEmailRegn("arunima.dhar052000@gmail.com");
//	  createAccount.enterPhoneRegn("8420613097");
//	  createAccount.enterPasswordRegn("Tommy#1234");
//	  createAccount.enterConfirmPswdRegn("Tommy#1234");
//	  createAccount.clickSignUpButton();
	  
//	  String currentUrl=driver.getCurrentUrl();
//	  if(currentUrl.equals("https://www.pothys.com/login"))
//	  {
//		  System.out.println("User already registered");
//		  Reporter.log("User already has an registerd account");
//	  }
	  
	  
  }
//  @Test(priority=1,dataProvider="getTestData")
//  public void createNewAccount(String email,String password) {
//   HomePageObjects createAccount=new HomePageObjects(driver);
//   
//      createAccount.clickloginIcon();
//	  createAccount.enterEmailRegn(email);//dhar.munni@gmail.com
//	  createAccount.enterPhoneRegn("8420613097");
//	  createAccount.enterPasswordRegn(password);
//	  createAccount.enterConfirmPswdRegn(password);//#Star1234
//	  createAccount.clickSignUpButton();
//  
//	  String currentUrl=driver.getCurrentUrl();
//	  if(currentUrl.equals("https://www.pothys.com/verification"))
//	  {
//		  System.out.println("New User Account Created");
//		  Reporter.log("New User Account has been created");
//	  }
//	  
//	  
//	  
//	  
//  }
  

}
