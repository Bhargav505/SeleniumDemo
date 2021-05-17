package classDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		  //driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		 Actions builder = new Actions(driver);
         builder.moveToElement(driver.findElement(By.xpath("//input[@id='imagesrc']"))).click().build().perform();
		Runtime.getRuntime().exec("E:\\FileUpload.exe");
		
		
		
		
		
		
		
		

	}

}
