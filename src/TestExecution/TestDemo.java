package TestExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demoClass.CreateAcc;
import demoClass.OrderHistory;
import demoClass.SignIn;
import demoClass.UserLogin;
import demoClass.WomenTab;

public class TestDemo {
	WebDriver driver;
	
	
	@BeforeTest()
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromeVersion81\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
    @Test(priority=-2)
    public void newUser()
    {
    	SignIn s = new SignIn(driver);
    	s.signInButton();
    }
    	
    @Test(priority=-1) // Account creation for user
    public void createAcc()
    {
    		CreateAcc c = new CreateAcc(driver);
    		c.textBox();
    		c.createButton();
    		c.mrs();
    		c.firstName();
    		c.lastName();
    		c.emailId();
    		c.password();
    		c.days();
    		c.months();
    		c.years();
    		c.fname();
    		c.lname();
    		c.address1();
    		c.address2();
    		c.city();
    		c.state();
    		c.country();
    		c.information();
    		c.phone();
    		c.postcode();
    		c.registerButton();
    	}
    
    @Test(priority=1)
    public void signOut() {
    	UserLogin user = new UserLogin(driver);
    	user.signOut();
    }
    	
    @Test(priority=2)
    	public void signIn()
    	{
    	SignIn user = new SignIn(driver);
    	user.signInButton();
    }
    
    @Test(priority=3,dependsOnMethods = "createAcc") // New User SignIn
	public void userLogin()
    {
    	UserLogin login = new UserLogin(driver);
    	login.userName();
    	login.password();
    	login.submit();
    }
    
    @Test(priority=4) // clicking on TOP tab
    public void women() 
    {
    	WomenTab select = new WomenTab(driver);
    	select.womenButton();
    	select.top();
  
    	WebElement QuickView = driver.findElement(By.xpath("//img[@title='Blouse']"));
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	      js.executeScript("arguments[0].scrollIntoView();",QuickView);
    	QuickView.click();
    }
    
    @Test(priority=5) // Add 2 quality of product
    public void addQuantity()
    {
    	WomenTab Quantity = new WomenTab(driver);
    	Quantity.add();
    	Quantity.addToCart();
     	Quantity.checkout1();
    	WebElement a=driver.findElement(By.xpath("//span[@id='total_price']"));//we are validating amount of selected order and will print in console.
    	System.out.println(a.getText());
    	Quantity.checkout2();
  
    	WebElement scroll = driver.findElement(By.xpath("//h3[@class='page-subheading'][2]"));
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	      js.executeScript("arguments[0].scrollIntoView();",scroll);
    }
    
    @Test(priority=6)  //final checkout page and ammount paid by cheque.
    public void checkOut()
    {
    	WomenTab Checkout = new WomenTab(driver);
    	Checkout.checkout3();
    	Checkout.termOfService();
    	Checkout.checkout4();
    	Checkout.payment();
    	Checkout.orderPlace();	
    	
    }
  
    @Test(priority=7)
    public void AmmountValidation()
    {
    	OrderHistory ammount = new OrderHistory(driver);
    	ammount.myProfile();
    	ammount.orderHistory();
    	WebElement ammount1 = driver.findElement(By.xpath("//span[@class='price']")); //Ammount to be payable validated is printed on console screen i.e $56.00 
    	System.out.println(ammount1.getText());
    	
    }
   
    @AfterTest
    public void closeWindow()
  {
    	driver.close();
  }
  
    
    
}
