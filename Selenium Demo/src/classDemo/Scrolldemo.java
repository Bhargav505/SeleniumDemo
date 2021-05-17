package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		driver.manage().window().maximize();
		
		//Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");  

      //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//li/a[@class='webCheckLink']"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);


	}

}
