package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
	WebDriver driver;
	 
	public Register(WebDriver driver) {
		 this.driver=driver;
	}


	public void Register_Textbox(String value1,String value2) {
		driver.findElement(By.xpath("//input[@placeholder='"+value1+"']")).sendKeys(value2);
	}


}
