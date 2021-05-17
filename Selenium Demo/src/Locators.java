import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Locators {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.name("radiooptions")).click(); 
		List<WebElement> element=driver.findElements(By.tagName("select"));
		System.out.println(+element.size());
		for(WebElement element1:element)
		{
			System.out.println(element1.getAttribute("placeholder"));
			
			
		}
		

	}

}
