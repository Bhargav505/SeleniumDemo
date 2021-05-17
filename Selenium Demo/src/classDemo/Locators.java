package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        //driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.name("radiooptions")).click();
		
		
		
		
		
		

	}

}
