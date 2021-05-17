import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Gettitle {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		String title=driver.getTitle();
		System.out.println("Title of the webpage is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("url of the webpage is "+url);
//		String pagesource=driver.getPageSource();
//		System.out.println("Pagesource of the webpage is "+pagesource);
		//Delete cookies from the browser
				driver.manage().deleteAllCookies();
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();
				
	WebElement w1=driver.findElement(By.xpath("//h1"));
	String str=w1.getText();
	System.out.println("Text is"+str);
	List<WebElement> element=driver.findElements(By.tagName("input"));
	System.out.println("element"+element.size());
	for(WebElement element1:element)
	{
		System.out.println(element1.getAttribute("type"));
	}
	
	}
	}
	
	

