package classDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependentDemo {
	public static WebDriver driver;
  @Test
  public void Launchchromedriver() {
	  driver=new ChromeDriver();
	  System.out.println("chromedriver starts"); 
  }
  @Test(dependsOnMethods="Launchchromedriver")
  public void openURL() {
	  driver.get("https://amazon.com");
	  
  }
}
