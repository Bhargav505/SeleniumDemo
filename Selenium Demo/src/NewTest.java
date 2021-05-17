import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
  }
  
  @Test
  public void f1() {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	  
	  
  }
  
  
}
