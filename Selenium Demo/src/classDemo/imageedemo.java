package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageedemo {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		//Click on the image in selenium webdriver
		//driver.findElement(By.cssSelector("[aria-label='Facebook']")).click();
		//System.out.println("Opening Facebook home page");
		
		//tagname[attribute name=’attribute value’]
		
		driver.findElement(By.cssSelector("a[aria-label='Facebook']")).click();
		System.out.println("Opening Facebook home page");
		
		
		
		
		
		
		
		
		

	}

}
