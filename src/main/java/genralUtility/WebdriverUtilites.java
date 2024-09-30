package genralUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebdriverUtilites

{
	WebDriver driver;

	public void mouseHover(WebDriver driver,WebElement element)
	  {
	    Actions a=new Actions(driver);
	    a.moveToElement(element).perform();
	  }
	
	  
	  public void waitForPageToLoad(WebDriver driver)
	  {
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
}
