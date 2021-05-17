package JavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExec {
	public static WebDriver driver;
	
  @Test
  public void chromeBrowser() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://amazon.com");
  }
  @Test
  public void firefoxBrowser() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://amazon.com");
	  
	  
  }
}
