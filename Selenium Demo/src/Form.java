 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Bhargav");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhargavreddy6@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("+919742107524");
		driver.findElement(By.xpath("//input[@type='radio'][@class='ng-pristine ng-untouched ng-invalid ng-invalid-required']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()[contains(.,'English')]]")).click();
		Select value=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		value.selectByVisibleText("Android");
		value.selectByIndex(1);
		
		
		
		
		
		
		
		
		
		

	}

}
