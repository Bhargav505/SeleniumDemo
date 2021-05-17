package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		action.moveToElement(element).click();
		action.sendKeys("hello").build().perform();
		//click UP arrow key
		action.sendKeys(Keys.UP).build().perform();
		action.sendKeys("cursorbegining").build().perform();
		//click TAB  key
		action.sendKeys(Keys.TAB).build().perform();
	    action.sendKeys("Alluri").build().perform();
	    action.sendKeys(Keys.TAB).build().perform();
	    action.sendKeys("India").build().perform();

	}

}
