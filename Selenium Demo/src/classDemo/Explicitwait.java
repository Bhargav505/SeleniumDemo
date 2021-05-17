package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
	 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 WebDriverWait wait = new WebDriverWait(driver,40);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First']"))).sendKeys("hello");; 

		 

	}

}
