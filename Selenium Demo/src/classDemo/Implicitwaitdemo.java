package classDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitdemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		// Thread.sleep(8000);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bhargav");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
		 //driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		 driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("India");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhargavreddy6@gmail.com");
		 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9742107524");
		 driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).click();;
		 driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkbox1']")).click();;
		 driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkbox2']")).click();;
		 driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		

	}

}
