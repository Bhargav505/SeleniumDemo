package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotestt {
	
	public static WebDriver driver;
  @Test(priority=2)
  public void Launch() {
	  System.out.println("Launch Browser");
	  
	  driver=new ChromeDriver();
	  driver.get("https://www.netflix.com/in/");

  }
  @Test(priority=1)
  public void signin() {
	  System.out.println("sign button");
	  driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	 
	  
  }
}
