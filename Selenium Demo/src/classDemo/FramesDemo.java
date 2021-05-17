package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
	 
		 WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Frames.html");
	        //Switch to the frame by index:
	        //driver.switchTo().frame(0);
	        //Switch to the frame by Name or ID:
	        driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inside IFrame");
		 // driver.switchTo().defaultContent();
		  driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        Thread.sleep(2000);
		// IFrame2 Switch to the frame by Web Element:
		WebElement element=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(element);
		//IFrame1
		WebElement element1=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(element1);
		//Textbox
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inside Iframe with an iframe");
		
		
		
		
		
		

	}

}
