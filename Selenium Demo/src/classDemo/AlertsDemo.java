package classDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Alerts.html");
	        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	        Thread.sleep(2000);
		// Simple Alert
	      Alert alert=driver.switchTo().alert();
		  alert.accept();
		//Confirmnation alert
		  driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		  driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		  Thread.sleep(2000);
		  alert.dismiss();
		  Thread.sleep(2000);
		 //Prompt Alert
		  driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		  driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		  Thread.sleep(2000);
		  Alert alert1=driver.switchTo().alert();
		  alert1.sendKeys("Hello Training");
		  alert1.accept();
		  
		  
		  
		
		

	}

}
