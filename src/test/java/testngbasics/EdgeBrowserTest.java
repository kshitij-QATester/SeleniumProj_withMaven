package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowserTest {
	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test 
	public void CrossBrowserTest1() throws InterruptedException {
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
	
}
