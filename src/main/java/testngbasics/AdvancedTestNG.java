package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvancedTestNG {

	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test (priority = 1)
	public void Setup() throws Exception
	{
		  d=new ChromeDriver();
		  d.get(url);
		  Thread.sleep(8000);
	}
	
	@Test (priority=2)
	public void LoginFormAutomate() throws InterruptedException
	{
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		  Thread.sleep(12000);
	}
	
	@Test (priority=3, invocationCount = 4)
	public void AddEmp() throws InterruptedException
	{
		  d.findElement(By.xpath("(//span[contains(.,'PIM')])[1]")).click();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Pravin");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Ashok");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Shinde");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		  Thread.sleep(5000);
		 
	}
	
	@Test (priority = 4, enabled=false)
	public void MouseHoverTest()
	{
		
	}
	
}
