package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		//Syntax of xpath
		 //tagname[@Attribute name='Attribute value']
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
		//Syntax to find the text value //tagname[text()=’textvalue’]
		 driver.findElement(By.xpath("//a[text()='English']")).click();
		 //Select objectname= new classname(Xpath syntax);
		 Select element=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));	
		 element.selectByVisibleText("Android");
		 element.selectByIndex(1);

		 
		
		 
		 
		 
		 
								
		
		
		
		
		

	}

}
