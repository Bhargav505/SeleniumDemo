import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.switchTo().frame("SingleFrame");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Training");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		 Thread.sleep(4000);
		 WebElement element=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 driver.switchTo().frame(element);
		 WebElement element1=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 driver.switchTo().frame(element1);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Training");
	
		 
		 
	}

}
