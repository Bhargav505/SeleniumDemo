package Stepdefintion;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionlibrary {
	public static WebDriver driver;
	
	public static void login(String url) throws Throwable {
		driver=new ChromeDriver();
		System.out.println(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				
}
	
	// Button function
	public static void button(String button) {
		driver.findElement(By.xpath("//a[text()='"+button+"']")).click();
	}
			 
	public static void TakeScreenshot()
	{
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	        	org.apache.commons.io.FileUtils.copyFile(screenshot,new File("C:\\Users\\Bhargav\\eclipse-workspace\\DataDrivenFramework\\Screenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());

}

		 
}


	public static void closed() {
		driver.close();
		
	}

 
	
	
	
}
