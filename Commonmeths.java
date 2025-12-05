package CommonUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonmeths {
      public WebDriver driver;
	
      public void launchbrowserfirefox()
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshad\\OneDrive\\Desktop\\SeedInfotech\\eclipse\\SeleniumAutomation\\lib\\geckodriver.exe");
	     
	     driver= new FirefoxDriver();
	        
	}

	public WebDriver launchbrowserChrome()
	{
		System.setProperty("webdriver.chrome.driver",
	              "\\C:\\Users\\Harshad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        return driver;
	}
	
	public WebDriver launchApplication() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.irctc.co.in/nget/profile/user-signup");
		Thread.sleep(2000);
		return driver;
    }
	
	public void doLogin()
	{
		
	}
	
	public void doLogout()
	{
		driver.close();
	}
	public WebDriver TakeScreenshot() throws InterruptedException
	{
		WebElement logo1=driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]"));
	  	 File sourcefile=logo1.getScreenshotAs(OutputType.FILE);
	  	 Thread.sleep(2000);
	  	 File destfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo1.png");
	  	 sourcefile.renameTo(destfile);
		 return driver;
	}
	
}
