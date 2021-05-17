package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://edition.cnn.com/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[text()='Travel'][@type='collapsed']"));
		action.moveToElement(element).build().perform();;
		
		

	}

}
