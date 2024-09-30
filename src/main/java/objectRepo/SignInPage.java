package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	  public SignInPage(WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	  
	  @FindBy(xpath="//input[@name='email']")
	  private WebElement EmailId;
	  
	  @FindBy(xpath="//span[@id='continue']")
	  private WebElement ContinueButton;
	  
	  @FindBy(xpath="//input[@name='password']")
	  private WebElement PasswordButton;
	  
	  @FindBy(xpath="//input[@id='signInSubmit']")
	  private WebElement SignInButton;
	  
	  
	  public WebDriver getDriver() 
	  {
	    return driver;
	  }

	  public WebElement getEmailId() 
	  {
	    return EmailId;
	  }

	  public WebElement getContinueButton() 
	  {
	    return ContinueButton;
	  }

	  public WebElement getPasswordButton()
	  {
	    return PasswordButton;
	  }

	  public WebElement getSignInButton() 
	  {
	    return SignInButton;
	  }
	  
	  
	  public void signIn(String email,String password) throws Throwable
	  {
	     Thread.sleep(2000);
	   EmailId.sendKeys(email);
	   Thread.sleep(2000);
	   ContinueButton.click();
	   Thread.sleep(2000);
	   PasswordButton.sendKeys(password);
	   Thread.sleep(2000);
	   SignInButton.click();
	   
	  }
}
