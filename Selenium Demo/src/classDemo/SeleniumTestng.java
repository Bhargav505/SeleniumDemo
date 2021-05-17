package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestng {
	
	public static WebDriver driver;
	
//	@AfterTest
//	  public void closeapp()
//	  {
//		  driver.close();
//	  }
  @Test (priority=1)
  public void signin() {
	  
	  driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	  
  }
  
 @Test(priority=2)
 public void EmailTextbox() {
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhargav@yahoo.com");
	  
  }
  
  @BeforeTest
	public void launch() {
		
		 driver=new ChromeDriver();
		driver.get("https://netflix.com");
	}
  
  
}
