package classDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(classDemo.ListenersDemo.class)
public class TestDemo {
  @Test
  public void Launch() {
	  
	  WebDriver driver=new ChromeDriver();
      driver.get("http://demo.automationtesting.in/");
  }
}
