package demoClass;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.WebElement;

public class SignIn {

	@FindBy(xpath="//a[@class='login']") private WebElement SignIn;

    public <WebDriver> SignIn(org.openqa.selenium.WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	 
    public void signInButton()
    {
   	 
   	 SignIn.click();
    }
}
