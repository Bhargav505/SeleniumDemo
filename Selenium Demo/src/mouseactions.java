import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://timesofindia.indiatimes.com/");
		 Actions action=new Actions(driver);
		 WebElement l = driver.findElement(By.xpath("//*[@id='nav-city']/a"));
		 //action.contextClick(element).build().perform();
		 //action.doubleClick(element).build().perform();
		action.moveToElement(l).click();
		//click down arrow key
				action.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(2000);
				//click down arrow key
				action.sendKeys(Keys.DOWN).build().perform();		
				Thread.sleep(2000);
				//click down arrow key
				action.sendKeys(Keys.ENTER).build().perform();

}
}
