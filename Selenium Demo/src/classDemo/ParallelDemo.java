package classDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
	public static WebDriver driver;
	
  @Test
  public void chromebrowser() {
	   driver=new ChromeDriver();
	  driver.get("https://paypal.com");
	  System.out.println("Running in chrome browser");
  }
  @Test
  public void firefoxbrowser() {
	  driver=new FirefoxDriver();
	  driver.get("https://paypal.com");
	  System.out.println("Running in firefox browser");
	  
  }
}
