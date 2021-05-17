package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		 
		 
		WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Im")).click();
		//Relative xpath
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		

	}

}
