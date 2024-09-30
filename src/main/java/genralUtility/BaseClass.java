package genralUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.LoginPage;
import objectRepo.SignInPage;

public class BaseClass {

	  public WebDriver driver;
	  public static WebDriver sDriver;
	  PropertyUtilities plib=new PropertyUtilities();
	  @BeforeClass
	  public void BC() throws Throwable
	  {
	    String Browser=plib.getProperttFiles("browser");
	    System.out.println("=====Launching Browser=====");
	    if(Browser.equalsIgnoreCase("chrome"))
	    {
	      WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	    }
	    else if(Browser.equalsIgnoreCase("Firefox"))
	    {
	      WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver();
	    }
	    else
	    {
	      driver=new ChromeDriver();
	    }
	    sDriver=driver;
	  }
	  
	  @BeforeMethod
	  public void BM() throws Throwable
	  {
	    String Url=plib.getProperttFiles("url");
	    System.out.println("====Launching the Application====");
	      Thread.sleep(2000);
	    driver.get(Url);
	    System.out.println("====Application launched Successfully====");
	    driver.manage().window().maximize();
	    LoginPage login=new LoginPage(driver);
	    String UserName=plib.getProperttFiles("userName");
	      String Password=plib.getProperttFiles("password");
	    login.loginPage(UserName,Password);
	    System.out.println("====Going to Sign In Page====");
	      Thread.sleep(2000);
//	      SignInPage signIn=new SignInPage(driver);
//	      String UserName=plib.getProperttFiles("userName");
//	      String Password=plib.getProperttFiles("password");
//	      signIn.signIn(UserName,Password);
	    System.out.println("====Sign In Successfully====");
	  }
}
