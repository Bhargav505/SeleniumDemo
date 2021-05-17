package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(JavaPrograms.ListenerTest.class)
public class Test1 {
	public static WebDriver driver;
  @Test
  public void launch() {
	  driver=new ChromeDriver();
	  driver.get("https://amazon.com");
	  //driver.findElement(By.xpath("aagag")).click();;
	  
	  
	  
  }
}
