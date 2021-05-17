package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Thread.sleep(2000);
        //Actions objectname= new Actions(driver);
        Actions action=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//li[@name='C']"));
        action.clickAndHold(element).build().perform();;
        
		
		
		
		
		
		
		
		

	}

}
