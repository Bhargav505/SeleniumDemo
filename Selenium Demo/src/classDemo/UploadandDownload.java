package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadandDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		//To upload file in selenium we use SendKeys
		element.sendKeys("C:\\image.png");
		 //Download the file
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='More']")).click();
		driver.findElement(By.xpath("//a[text()='File Download']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Download']")).click();
		 

	}

}
