package waitsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsDemo {
	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test (priority=1)
	public void ImplicitWaitExample() throws InterruptedException {
		  d=new ChromeDriver();
		  d.get(url);
		 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(4)); //implicit wait
		Thread.sleep(10000);
		  
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
		  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		 Thread.sleep(12000);
	}
	
	
	
	@Test (priority=2)
	public void ExplicitWaitExample()
	{
		//Explicit Wait 
		
		WebDriverWait w=new WebDriverWait(d,Duration.ofMinutes(2));
		//WebDriverWait is predefined class from org.openqa.selenium package
		//it is mostly used for Explicit Wait
		
	WebElement PIMoption= w.until(
	ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'PIM')]")));
		
	PIMoption.click();
	
	WebElement Addbutton=w.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Add')]")));
	
	Addbutton.click();	
	}
	
	@Test (priority=3)
	public void FluentWaitExample()
	{
		 Wait<WebDriver> fw = new FluentWait<WebDriver>(d)
			            .withTimeout(Duration.ofMinutes(2))
			            .pollingEvery(Duration.ofSeconds(5))
			            .ignoring(ElementNotInteractableException.class);
		 
		 
		 
		 
WebElement fname= fw.until(
ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

fname.sendKeys("Sam");

WebElement mname= fw.until(
ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

mname.sendKeys("M");

WebElement lname= fw.until(
ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

lname.sendKeys("Keninson");

WebElement savebutton= fw.until(
ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

savebutton.click();







	}
	
	
	
	
	
	
	
	
}
