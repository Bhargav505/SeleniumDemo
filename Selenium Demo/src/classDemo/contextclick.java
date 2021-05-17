package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
      //  Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//li[@class='orb-nav-sport']/a[text()='Sport']"));
		//action.contextClick(element).build().perform();
		action.doubleClick(element).build().perform();
		

	}

}
