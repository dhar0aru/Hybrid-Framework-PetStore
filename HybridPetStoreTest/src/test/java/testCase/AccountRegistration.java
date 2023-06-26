package testCase;
import objects.AccountPageObjects;
import objects.HomePageObjects;
import objects.LoginPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
   
   @Test(priority=1)
   public void newUser() throws InterruptedException {
	   AccountPageObjects createAccount=new AccountPageObjects(driver);

       LoginPageObjects register = new LoginPageObjects(driver);

       HomePageObjects home = new HomePageObjects(driver);
       

       driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();

       

       //register.clickLoginBtn();
       
       home.clickSignInBtn();
       
       register.clickRegisterBtn();

       createAccount.enterUId("Meghna0604");

       createAccount.enterNewPswrd("1234");

       createAccount.enterRepswrd("1234");

       createAccount.enterFName("Meghna");

       createAccount.enterLName("Chakraborty");

       createAccount.enterEmail("abc@gmail.com");

       createAccount.enterPhone("9876543210");

       createAccount.enterAdd1("64 Sodepur 1st lane");

       createAccount.enterAdd2("Shivam Apartment");

       createAccount.enterCity("Kolkata");

       createAccount.enterState("West Bengal");

       createAccount.enterZip("700082");

       createAccount.enterCountry("India");

       

       WebElement Option1 = driver.findElement(By.xpath("//select[@name='account.languagePreference']/option[text()='english']"));

        

       WebElement Option2 = driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']/option[text()='BIRDS']"));

        

       driver.findElement(By.xpath("//input[@type='checkbox' and @name='account.listOption' and @value='true']")).click();



       driver.findElement(By.xpath("//input[@type='checkbox' and @name='account.bannerOption' and @value='true']")).click();

       

       createAccount.clickSubmitBtn();

       Thread.sleep(3000);

       String currentUrl=driver.getCurrentUrl();

       if(currentUrl.equals("https://petstore.octoperf.com/actions/Catalog.action"))

       {

           System.out.println("Account Created!");

           Reporter.log("User already has an registerd account");

       }
   }
  
   @Test(priority=1)
	public void registerWithExistingCredentials() throws InterruptedException {
		
	   AccountPageObjects createAccount=new AccountPageObjects(driver);

       LoginPageObjects register = new LoginPageObjects(driver);

       HomePageObjects home = new HomePageObjects(driver);
       

       driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();

       

       //register.clickLoginBtn();
       
       home.clickSignInBtn();
       
       register.clickRegisterBtn();

       createAccount.enterUId("Tara1234");

       createAccount.enterNewPswrd("Tommy#1234");

       createAccount.enterRepswrd("Tommy#1234");

       createAccount.enterFName("Tara");

       createAccount.enterLName("Biswas");

       createAccount.enterEmail("arunima.dhar052000@gmail.com");

       createAccount.enterPhone("8420613097");

       createAccount.enterAdd1("70, Kumud Ghosal Road");

       createAccount.enterAdd2("Ariadaha");

       createAccount.enterCity("Kolkata");

       createAccount.enterState("West Bengal");

       createAccount.enterZip("700057");

       createAccount.enterCountry("India");

       

       WebElement Option1 = driver.findElement(By.xpath("//select[@name='account.languagePreference']/option[text()='english']"));

        

       WebElement Option2 = driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']/option[text()='FISH']"));

        

       driver.findElement(By.xpath("//input[@type='checkbox' and @name='account.listOption' and @value='true']")).click();



       driver.findElement(By.xpath("//input[@type='checkbox' and @name='account.bannerOption' and @value='true']")).click();

       

       createAccount.clickSubmitBtn();

       Thread.sleep(3000);

      // String currentUrl=driver.getCurrentUrl();
       
       if(driver.getPageSource().contains("HTTP Status 500 – Internal Server Error")){
			  System.out.println("User Already Exists!");
			  Thread.sleep(1000);
       }
  

}
}
