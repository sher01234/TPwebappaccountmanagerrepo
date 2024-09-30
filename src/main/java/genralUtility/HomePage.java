package genralUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage

{

	public HomePage(WebDriver driver)
	  
	  {
	    PageFactory.initElements(driver,this);
	  }
	  
	  WebdriverUtilites wlib=new WebdriverUtilites();
	  
	  
	  @FindBy(xpath="//span[@class='MuiBadge-root BaseBadge-root css-10hmp62']")
	  private WebElement AccountDropDown;
	  
	  @FindBy(xpath="//button[text()='Log Out']")
	  private WebElement SignOut;
	  
	  
	  
	  
	  public WebElement getAccountDropDown() 
	  {
	    return AccountDropDown;
	  }


	  public void signout(WebDriver driver) throws Throwable
	  {
		  Thread.sleep(1200);
	    AccountDropDown.click();;
	    Thread.sleep(2000);
	    SignOut.click();
	  }
}
