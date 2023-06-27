package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
 
  WebDriver driver;
  
  public LoginPageObjects(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath="//input[@name='username']")
  WebElement UserName;
  @FindBy(xpath="//input[@name='password' and @type='password' and @value='j2ee']")
  WebElement Password;
  
  @FindBy(xpath="//input[@name='signon' and @type='submit' and @value='Login']")
  WebElement LoginBtn;
  
  @FindBy(xpath="//a[text()='Register Now!']")
  WebElement RegisterBtn;

  

  
  public void enterUserName(String userName) {
	  UserName.clear();
	  UserName.sendKeys(userName);
  }
  public void enterPassword(String password) {
	  Password.clear();
	  Password.sendKeys(password);
  }
  
  public void clickLoginBtn() {
	  LoginBtn.click();
  }
  
  public void clickRegisterBtn() {
	  RegisterBtn.click();
  }
  
  
  
}
