package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageObjects {
 
  WebDriver driver;
  
  public AccountPageObjects(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath="//input[@name='username']")
  WebElement UId;
  @FindBy(xpath="//input[@name='password']")
  WebElement NewPswrd;
  @FindBy(xpath="//input[@name='repeatedPassword']")
  WebElement Repswrd;
  
  @FindBy(xpath="//input[@name='account.firstName']")
  WebElement FName;
  @FindBy(xpath="//input[@name='account.lastName']")
  WebElement LName;
  @FindBy(xpath="//input[@name='account.email']")
  WebElement Email;
  @FindBy(xpath="//input[@name='account.phone']")
  WebElement Phone;
  @FindBy(xpath="//input[@name='account.address1']")
  WebElement Add1;
  @FindBy(xpath="//input[@name='account.address2']")
  WebElement Add2;
  @FindBy(xpath="//input[@name='account.city']")
  WebElement City;
  @FindBy(xpath="//input[@name='account.state']")
  WebElement State;
  @FindBy(xpath="//input[@name='account.zip']")
  WebElement Zip;
  @FindBy(xpath="//input[@name='account.country']")
  WebElement Country;
  

  @FindBy(xpath="//input[@name='newAccount']")
  WebElement SubmitBtn;
  

  
  public void enterUId(String userId) {
	  UId.sendKeys(userId);
  }
  public void enterNewPswrd(String password) {
	  NewPswrd.sendKeys(password);
  }
  public void enterRepswrd(String password) {
	  Repswrd.sendKeys(password);
  }
  
  public void enterFName(String firstName) {
	  FName.sendKeys(firstName);
  }
  public void enterLName(String lastName) {
	  LName.sendKeys(lastName);
  }
  public void enterEmail(String email) {
	  Email.sendKeys(email);
  }
  public void enterPhone(String phone) {
	  Phone.sendKeys(phone);
  }
  public void enterAdd1(String add1) {
	  Add1.sendKeys(add1);
  }
  public void enterAdd2(String add2) {
	  Add2.sendKeys(add2);
  }
  public void enterCity(String city) {
	  City.sendKeys(city);
  }
  public void enterState(String state) {
	  State.sendKeys(state);
  }
  public void enterZip(String zip) {
	  Zip.sendKeys(zip);
  }
  public void enterCountry(String country) {
	  Country.sendKeys(country);
  }
  public void clickSubmitBtn() {
	  SubmitBtn.click();
  }
  
  
  
}
