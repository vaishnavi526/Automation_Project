package demoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenTab {

	
	@FindBy(xpath="//a[@title='Women']") private WebElement Women;
	@FindBy(xpath="//a[@title='Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.   Find the cut that suits you the best!']") private WebElement Top;
	@FindBy(xpath="//img[@title='Blouse']") private WebElement QuickView;
	@FindBy(xpath="//i[@class='icon-plus']") private WebElement Add;
	@FindBy(xpath="//button[@class='exclusive']") private WebElement AddToCart;
	@FindBy(xpath="//a[@title='Proceed to checkout']") private WebElement Checkout1;
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']") private WebElement CheckOut2;
	@FindBy(xpath="//input[@id='cgv']") private WebElement TermsOfService;
	@FindBy(xpath="//button[@name='processAddress']") private WebElement CheckOut3;
	@FindBy(xpath="//button[@name='processCarrier']") private WebElement CheckOut4;
	@FindBy(xpath="//a[@title='Pay by check.']") private WebElement PayByCheck;
	@FindBy(xpath="//button[@type='submit'][2]") private WebElement ConfirmOrder;
	
	public WomenTab(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}

	public void womenButton()
	{
		Women.click();
	}
	
	public void top()
	{
		Top.click();
	}
	
	public void quickView()
	{
		QuickView.click();
	}
	
	public void add()
	{
		Add.click();
	}
	
	
	public void addToCart()
	{
		 AddToCart.click();
	}
	
	public void checkout1()
	{
	Checkout1.click();
	}
	
	public void checkout2()
	{
		CheckOut2.click();
	}
	
	public void termOfService()
	{
		TermsOfService.click();
	}
	
	public void checkout4()
	{
		CheckOut4.click();
	}
	
	public void checkout3()
	{
		CheckOut3.click();
	}
	
	public void payment()
	{
		PayByCheck.click();
	}
	
	public void orderPlace()
	{
		ConfirmOrder.click();
	}
	
}


