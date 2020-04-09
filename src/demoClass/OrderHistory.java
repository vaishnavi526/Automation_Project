package demoClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	
	
	@FindBy(xpath="//a[@title='View my customer account']") private WebElement MyProfile;
	@FindBy(xpath="//a[@title='Orders']") private WebElement OrderHistory;


	
	
	public OrderHistory(WebDriver driver) 
	
	{
		
		PageFactory.initElements(driver, this);
	}

	public void myProfile() {
		
		MyProfile.click();
	}
	 
	public void orderHistory() {
		
		OrderHistory.click();
	}
		

}
