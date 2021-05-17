package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) {
		 
		 WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Register.html");
	        WebElement element=driver.findElement(By.xpath("//h1"));
	        String str=element.getText();
	        System.out.println("Text is"+str);
	
		

	}

}
