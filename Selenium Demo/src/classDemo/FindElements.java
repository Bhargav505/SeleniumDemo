package classDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> element=driver.findElements(By.tagName("input"));
		System.out.println("Number of tags with input are"+element.size());
		for(WebElement element1:element) {
			System.out.println(element1.getAttribute("placeholder"));
			
		}
		
		

	}

}
