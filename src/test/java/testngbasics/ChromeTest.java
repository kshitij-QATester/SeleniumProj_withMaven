package testngbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test (priority=1)
	public void ChromeBrowserTest1() throws InterruptedException {
		  d=new ChromeDriver();
		  d.get(url);
		 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(4)); //implicit wait
		  
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
		  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		 
		  
		
	}
	/*
	@Test (priority = 2)
	public void FirefoxBrowserTest2() throws InterruptedException {
		  d=new FirefoxDriver();
		  d.get(url);
		  Thread.sleep(8000);
		  
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		  Thread.sleep(12000);
	}
	
	@Test (priority=3)
	public void EdgeBrowserTest3() throws InterruptedException {
		  d=new EdgeDriver();
		  d.get(url);
		  Thread.sleep(8000);
		  
		  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		  Thread.sleep(12000);
	}
	
	*/
}
