package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	
	public static WebDriver driver;
	public static void openthebrowser() {
		driver=new ChromeDriver();
	}
	public static void navigate()
	{
		driver.get("https://www.amazon.in/");
		
	}
 

}
