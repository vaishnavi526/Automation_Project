package demoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {
	
	@FindBy(xpath="//a[@class='logout']") private WebElement SignOut;
	@FindBy(xpath="//input[@id='email']") private WebElement UserName;
	@FindBy(xpath="//input[@id='passwd']") private WebElement Pass;
	@FindBy(id="SubmitLogin") private WebElement Submit;

	
	public UserLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signOut()
	{
		SignOut.click();
	}
	
	public void submit()
	{
		Submit.click();
	}
	
	public void userName()
	{
		UserName.sendKeys("vrj@gmail.com");
	}
	
	public void password()
	{
		Pass.sendKeys("pass123");
	}
	}