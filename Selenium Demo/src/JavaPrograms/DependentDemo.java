package JavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependentDemo {
	public static WebDriver driver;
  @Test
  public void Launch() {
	  
	  System.out.println("Launch the web browser");
	  driver=new ChromeDriver();
	  driver.get("https://zomato.com");
  }
 
  @Test(dependsOnMethods="Launch")
  public void sigin() {
	  
	  System.out.println("signin method");
	  String str=driver.getTitle();
	  System.out.println(str);
	   
  }
  
  
}
