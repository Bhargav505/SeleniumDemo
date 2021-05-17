import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
		 js.executeScript("scrollBy(0, 1000)");  

	}

}
