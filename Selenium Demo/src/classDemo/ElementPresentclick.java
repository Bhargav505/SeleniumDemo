package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentclick {

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
		 Thread.sleep(4000);
//		 if(driver.findElements(By.xpath("//div[@aria-label='Close ad']")).size()!=0)
//	 {
			 driver.switchTo().frame("ad_iframe");
			 System.out.println("Element is present");
			 driver.findElement(By.xpath("//div[@aria-label='Close ad']")).click();
			 Thread.sleep(4000);
//		 }
//		 else if(driver.findElements(By.xpath("//span[text()='Close']")).size()!=0)
//        {
			 driver.switchTo().frame("ad_iframe");
			 System.out.println("Element is present");
			 driver.findElement(By.xpath("//span[text()='Close']")).click();
			 Thread.sleep(2000);
//}
//		 else
			 System.out.println("There is no advertisement");
		 driver.findElement(By.xpath("//a[text()='Download']")).click();
		
		

	}

}
