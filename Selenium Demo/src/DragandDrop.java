import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions obj1=new Actions(driver);
		obj1.dragAndDrop(From,to).build().perform();;
		
		
	}

}
