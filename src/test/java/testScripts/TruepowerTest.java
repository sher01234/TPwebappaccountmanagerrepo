package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genralUtility.BaseClass;
import genralUtility.HomePage;
import genralUtility.WebdriverUtilites;

public class TruepowerTest extends BaseClass

{
	@Test
	public void truepower() throws Throwable
	{
		WebdriverUtilites wlib=new WebdriverUtilites();
	    wlib.waitForPageToLoad(driver);
	    HomePage homePage=new HomePage(driver);
	    Thread.sleep(4000);
	    String expectedTitle="All Stations Summary";
	    String actualTitle=driver.getTitle();
	    System.out.println("validated title successfully which is ---- "+" "+actualTitle);
	    homePage.signout(driver);
	    driver.quit();
	}
}
