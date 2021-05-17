import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edition.cnn.com/");
		Thread.sleep(2000);
		Actions obj1=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@type='collapsed'][text()='Business']"));
		obj1.moveToElement(element).build().perform();;
//		obj1.contextClick().build().perform();
//		obj1.doubleClick().build().perform();
		Thread.sleep(2000);
		//obj1.sendKeys(Keys.DOWN).build().perform();
		obj1.sendKeys(Keys.ENTER).build().perform();;
		//
		obj1.sendKeys(Keys.UP).build().perform();
//		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//		WebElement element1=driver.findElement(By.xpath("//li[text()= 'D']"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(element1);
//		actions.clickAndHold().perform();
		 
		
		
		
		
		
		
		
		

	}

}
