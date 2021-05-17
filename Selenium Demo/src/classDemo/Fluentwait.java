package classDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 //Fluent wait
		 FluentWait<WebDriver> fWait=new FluentWait<WebDriver>(driver)
				 .withTimeout(15,TimeUnit.SECONDS)
				 .pollingEvery(3, TimeUnit.SECONDS);
				 
	 fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']"))).sendKeys("hello");;

		
		
		

	}

}
