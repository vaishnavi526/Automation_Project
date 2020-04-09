package demoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import selenium.WebElement;

public class CreateAcc {

	@FindBy(id="email_create") private WebElement EmailBox;
    @FindBy(xpath="//i[@class='icon-user left']") private WebElement CreateButton;
    @FindBy(xpath="//input[@type='radio']") private WebElement Prefix;
    @FindBy(id="customer_firstname") private WebElement FirstName;
    @FindBy(id="customer_lastname") private WebElement LastName;
    @FindBy(id="email") private WebElement Emailid;
    @FindBy(id="passwd") private WebElement Password;
    @FindBy(id="days") private org.openqa.selenium.WebElement Days;
    @FindBy(id="months") private WebElement Months;
    @FindBy(id="years") private WebElement Years;
    @FindBy(xpath="//input[@id='firstname']") private WebElement Fname;
    @FindBy(xpath="//input[@id='lastname']") private WebElement Lname;
    @FindBy(id="address1") private WebElement Address1;
    @FindBy(id="address2") private WebElement Address2;
    @FindBy(id="id_state") private WebElement State;
    @FindBy(id="postcode") private WebElement Postcode;
    @FindBy(id="id_country") private WebElement Country;
    @FindBy(id="other") private WebElement Info;
    @FindBy(id="phone_mobile") private WebElement PhoneNo;
    @FindBy(id="alias") private WebElement Alias;
    @FindBy(id="submitAccount") private WebElement Register;
    @FindBy(id="city")  private WebElement City;
	
    
 public CreateAcc(WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }
 
 // NOTE: data used below are dummy data.
 
  public void textBox()
  {
	  EmailBox.sendkeys("vrj@gmail.com");
  }
  
  public void createButton()
  {	  CreateButton.click();   }
  
  public void mrs()
  {  Prefix.click();}
 
  public void firstName()
  {FirstName.sendkeys("julie");}

  public void lastName()
  {LastName.sendkeys("day");}
  
  public void emailId() 
  {Emailid.sendkeys("vrj@gmail.com");}
  
  public void password()
  {Password.sendkeys("pass123");}
 
  public void fname()
  {Fname.sendkeys("julie");}
  
  public void lname()
  {Lname.sendkeys("day");}

  public void address1()
  {Address1.sendkeys("st 490 Rally hills New york");}
  
  public void address2()
  {Address2.sendkeys(" st 490 Rally hills post Albany");}

  public void postcode()
  {Postcode.sendkeys("00000");}

  public void information()
  {Info.sendkeys("MyInfo");}
  
  public void phone()
  {PhoneNo.sendkeys("9876543221");}

  public void registerButton()
  {Register.click();}

  public void city()
  {Lname.sendkeys("Albany");}

  public void state() {
  Select s = new Select((org.openqa.selenium.WebElement) State);
  s.selectByVisibleText("New York");  }
  
  public void days() {
	  Select d = new Select( Days);
	  d.selectByValue("3");  }
	  
  public void months() {
	  Select m = new Select((org.openqa.selenium.WebElement) Months);
	  m.selectByVisibleText("october");  }
	  
  public void years() {
	  Select y = new Select((org.openqa.selenium.WebElement) Years);
	  y.selectByVisibleText("1995");  }
  
  
  public void country() {
	  Select C = new Select( (org.openqa.selenium.WebElement) Country);
	  C.selectByVisibleText("United States");  }
}




