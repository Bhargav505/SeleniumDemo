package classDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.chrome.driver", "Path of driver");
		WebDriver driver = new ChromeDriver();
		// set the time of 30 seconds for page to complete the loading

		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		
		
		
		
		
		
		

	}

}
