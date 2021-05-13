package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	WebDriver driver;
	
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Homepage(WebDriver driver) {
	 this.driver=driver;
	 }
	 
	public void Home_button(String value) {
		driver.findElement(By.xpath("//button[text()='"+value+"']")).click();
	}

	 
	
}
