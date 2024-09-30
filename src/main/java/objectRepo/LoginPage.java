package objectRepo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genralUtility.WebdriverUtilites;

public class LoginPage {

	WebDriver driver;
	  WebdriverUtilites wlib=new WebdriverUtilites();
	  public LoginPage(WebDriver driver)
	  
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }

	  @FindBy(xpath="//input[@placeholder='Enter your email']")
	  private WebElement EmailId;
	  
	  @FindBy(xpath="//input[@placeholder='Enter your password']")
	  private WebElement Password;
	  
	  @FindBy(xpath="//input[@type='submit']")
	  private WebElement LoginButton;
	  
	  
	  
	



	public WebElement getEmailId() {
		return EmailId;
	}





	public WebElement getPassword() {
		return Password;
	}





	public WebElement getLoginButton() {
		return LoginButton;
	}





	public void loginPage(String Email,String Pass) throws Throwable
	  {
		EmailId.sendKeys(Email);
		Thread.sleep(1200);
		Password.sendKeys(Pass);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		LoginButton.click();
	    
	  }
}
