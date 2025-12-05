package loginRepo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeAddEmpRepo {
	WebDriver driver;
	WebDriverWait Wait;
	
	public OrangeAddEmpRepo(WebDriver driver) {
		this.driver = driver;
		this.Wait = new WebDriverWait(driver,5);
    }
	
	
	public WebElement PIM()
	{
		WebElement PIM =driver.findElement(By.xpath("//span[text()='PIM']"));
		return PIM;
	}
	
	public WebElement AddEmployee()
	{
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class=\"oxd-topbar-body-nav\"]/ul/li[3]")));
		
	}
	
	public WebElement firstname()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
	    WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		return firstname;
	}
	
	public WebElement middlename()
	{
		WebElement middlename=driver.findElement(By.name("middleName"));
		return middlename;
	}
	
	public WebElement Lastname()
	{
		WebElement Lastname=driver.findElement(By.name("lastName"));
		return Lastname;
	}
	public WebElement EmpCode()
	{
		return driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
		
	}
	
	public WebElement enabledRadio() {
	    return Wait.until(ExpectedConditions.elementToBeClickable(
	        By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right")));
	}

	
	public WebElement uname()
	{
		WebElement uname=driver.findElement(By.xpath("//input[@autocomplete=\"off\"]"));
		return uname;
	}
	

	public WebElement savebtn()
	{
		WebElement savebtn=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		return savebtn;
		
	}
	
	public WebElement pwrd() {
	return Wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//label[text()='Password']/parent::div/following-sibling::div/input")
		));
		
}
		public WebElement cpwrd() {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/input")));
	
}
}