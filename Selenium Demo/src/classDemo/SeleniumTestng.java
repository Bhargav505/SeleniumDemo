package classDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumTestng {
	public static WebDriver driver;

  @Test
  public void display() {
	  System.out.println("In Test method");
	  driver.findElement(By.linkText("Gmail")).click();
 
  }
  @BeforeMethod
  public void Launch() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }
  @AfterMethod
  public void closeApp() {
	  driver.close();
  }

}
