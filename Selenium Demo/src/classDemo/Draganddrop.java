package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions action=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//a[text()[contains(.,' BANK ')]]"));
       // driver.switchTo().frame(0);
        WebElement target=driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
        action.dragAndDrop(source, target).build().perform();;
        
        
        
        
        
        

	}

}
