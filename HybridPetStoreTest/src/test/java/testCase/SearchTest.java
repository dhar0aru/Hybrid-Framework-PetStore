package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import objects.HomePageObjects;
import objects.LoginPageObjects;
import utility.TestDataFile;

public class SearchTest extends Base {
	
	@DataProvider
	  public Object[][] getTestData() 
		  { Object data[][]=TestDataFile.getTestData("Sheet1");
		  	return data;	  
		  }
	   
	   @Test(priority=1)
	   public void ValidSearch() throws InterruptedException {
		   LoginPageObjects login = new LoginPageObjects(driver);

		    HomePageObjects home = new HomePageObjects(driver);
		      
		     driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		     home.clickSignInBtn();
		     login.enterUserName("Meghna0604");
		     login.enterPassword("1234");
		     login.clickLoginBtn();
		     home.enterSearchField("Bulldog");
		     home.clickSearchBtn();
		     Thread.sleep(3000);
		     
		     if(driver.getPageSource().contains("Friendly dog from England")){
				  System.out.println("Search Successful!");
				  
	       }
	   }
		     
		     @Test(priority=2)
			   public void InvalidSearch() throws InterruptedException {
				   LoginPageObjects login = new LoginPageObjects(driver);

				    HomePageObjects home = new HomePageObjects(driver);
				      
				     driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
				     home.clickSignInBtn();
				     login.enterUserName("Meghna0604");
				     login.enterPassword("1234");
				     login.clickLoginBtn();
				     home.enterSearchField("Pen");
				     home.clickSearchBtn();
				     Thread.sleep(3000);
				     
				     if(driver.getPageSource().contains("Product ID")){
						  System.out.println("Searched Item not available!");
				     }	  
			       }
				     
				     @Test(priority=3)
					   public void SearchWithhoutKeyword() throws InterruptedException {
						   LoginPageObjects login = new LoginPageObjects(driver);

						    HomePageObjects home = new HomePageObjects(driver);
						      
						     driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
						     home.clickSignInBtn();
						     login.enterUserName("Meghna0604");
						     login.enterPassword("1234");
						     login.clickLoginBtn();
						     home.enterSearchField("");
						     home.clickSearchBtn();
						     Thread.sleep(3000);
						     
						     if(driver.getPageSource().contains("Please enter a keyword to search for, then press the search button.")){
								  System.out.println("Enter Something!");
								  
					       }

}
}
