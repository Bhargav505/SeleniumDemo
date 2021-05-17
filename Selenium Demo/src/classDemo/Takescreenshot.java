package classDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Takescreenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
			 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bhargav");
			 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
			 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		        //Copy the file to a location and use try catch block to handle exception
		        try {
		        	FileUtils.copyFile(screenshot, new File("E:\\Screenshots\\homePageScreenshot.png"));
		        } catch (IOException e) {
		            System.out.println(e.getMessage());

		        }
	}

}
