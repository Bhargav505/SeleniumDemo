package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shop {

public static WebDriver driver;

	public static void link(String value) {	
		driver.findElement(By.xpath("//a[text()='"+value+"']")).click();
	}
	public static void droplist(String value) {
		
		Select select=new Select((WebElement) By.xpath("//select[@name='orderby']"));
		select.selectByVisibleText(value);
		
	}
	
	
}
