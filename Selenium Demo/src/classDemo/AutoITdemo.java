package classDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITdemo {

	public static void main(String[] args) throws IOException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//input[@id='imagesrc']"))).click().build().perform();
		Runtime.getRuntime().exec("E:\\Fileupload.exe"); //AutoIT exec file or script
		System.out.println("File has been uploaded succesfully");
	
	
		
		
		
		
		
		

	}

}
