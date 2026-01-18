package testngbasics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
  @Test(dataProvider = "dp")
  public void f(String fname,String mname, String lname) throws InterruptedException {
	  
	  d.findElement(By.xpath("(//span[contains(.,'PIM')])[1]")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@name='middleName']")).sendKeys(mname);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	  Thread.sleep(5000);  
	  
	  d.close();
	  
  }
  @BeforeMethod
  public void LoginFormAutomate() throws InterruptedException {
	  
	  d=new ChromeDriver();
	  d.get(url);
	  Thread.sleep(8000);
	  
	  d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
	  Thread.sleep(12000);
  }


  @DataProvider
  public Object[][] dp() {
     Object[][] obj=new Object[4][3];
                           //[no of users][no of inputs]

     //0th Set
     obj[0][0]="Abcde";
     obj[0][1]="ksjs";
     obj[0][2]="sjnjs";
     
     //1st set
     obj[1][0]="Jay";
     obj[1][1]="M";
     obj[1][2]="kadam";
     
     //2nd set
     obj[2][0]="Admin";
     obj[2][1]="kms";
     obj[2][2]="admin12345";
     
     //3rd set
     obj[3][0]="Ajay";
     obj[3][1]="K";
     obj[3][2]="Shinde";
  
     return obj;
}
}