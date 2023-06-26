package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
 
  WebDriver driver;
  
  public HomePageObjects(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath="//img[@name='img_cart']//ancestor::a")
  WebElement AddToCartBtn;
  @FindBy(xpath="//a[text()='Sign In']")
  WebElement SignInBtn;
  @FindBy(xpath="//a[text()='?']")
  WebElement HelpBtn;
  
  @FindBy(xpath="//input[@name='keyword']")
  WebElement SearchField;
  @FindBy(xpath="//input[@name='searchProducts']")
  WebElement SearchBtn;
  
  @FindBy(xpath="//area[@alt ='Fish']")
  WebElement FishImglink;
  @FindBy(xpath="//area[@alt ='Dogs']")
  WebElement DogsImglink;
  @FindBy(xpath="//area[@alt ='Reptiles']")
  WebElement ReptilesImglink;
  @FindBy(xpath="//area[@alt ='Cats']")
  WebElement CatsImglink;
  @FindBy(xpath="//area[@alt ='Birds']")
  WebElement BirdsImglink;
  
  @FindBy(xpath="//img[@src='../images/fish_icon.gif']//ancestor::a")
  WebElement FishlinkBtn;
  @FindBy(xpath="//img[@src='../images/dogs_icon.gif']//ancestor::a")
  WebElement DogslinkBtn;
  @FindBy(xpath="//img[@src='../images/reptiles_icon.gif']//ancestor::a")
  WebElement ReptileslinkBtn;
  @FindBy(xpath="//img[@src='../images/cats_icon.gif']//ancestor::a")
  WebElement CatslinkBtn;
  @FindBy(xpath="//img[@src='../images/birds_icon.gif']//ancestor::a")
  WebElement BirdslinkBtn;
  
  public void clickAddToCartBtn() {
	  AddToCartBtn.click();
  }
  public void clickSignInBtn() {
	  SignInBtn.click();
  }
  public void clickHelpBtn() {
	  HelpBtn.click();
  }
  
  public void enterSearchField(String searchKeyword) {
	  SearchField.sendKeys(searchKeyword);
  }
  public void clickSearchBtn() {
	  SearchBtn.click();
  }
  
  
  public void clickFishImglink() {
	  FishImglink.click();
  }
  public void clickDogsImglink() {
	  DogsImglink.click();
  }
  public void clickReptilesImglink() {
	  ReptilesImglink.click();
  }
  public void clickCatsImglink() {
	  CatsImglink.click();
  }
  public void clickBirdsImglink() {
	  BirdsImglink.click();
  }
  
  public void clickFishlinkBtn() {
	  FishlinkBtn.click();
  }
  public void clickDogslinkBtn() {
	  DogslinkBtn.click();
  }
  public void clickReptileslinkBtn() {
	  ReptileslinkBtn.click();
  }
  public void clickCatslinkBtn() {
	  CatslinkBtn.click();
  }
  public void clickBirdslinkBtn() {
	  BirdslinkBtn.click();
  }
  
  
}
