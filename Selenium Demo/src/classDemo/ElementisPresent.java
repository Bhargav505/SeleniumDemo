package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisPresent {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paypal.com/");
		//Element is present or not
		if(driver.findElements(By.xpath("//a[text()='Sign Up for Free'][@name='ctaId']")).size()!=0)
		{
			System.out.println("Element is Present");
			driver.findElement(By.xpath("//a[text()='Sign Up for Free'][@name='ctaId']")).click();
		}
		else
			System.out.println("Element is not present");
			
		
		
		
		
		
		
		
		

	}

}
