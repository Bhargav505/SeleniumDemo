import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickimage {

	public static void main(String[] args) {
 
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/identify?ctx=recover");
			driver.findElement(By.cssSelector("a[aria-label='Facebook']")).click();
			

	}

}
